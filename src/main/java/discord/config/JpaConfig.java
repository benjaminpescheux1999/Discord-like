package discord.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //Activate l e s annotations @Transactionnal
@EnableJpaRepositories("discord.dao") // Activate spring-data-j pa
public class JpaConfig {
	
	@Bean
	public DataSource dataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS01;databaseName=Discord");
		dataSource.setUsername("sa");
		dataSource.setPassword("Not24Get");
		dataSource.setMaxTotal(10);
		
		return dataSource;
	}
	
	
	//Configuration d e EntityManagerFactory pour f a b r i q u e d e s EntityManager
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		Properties hibernateProperties = new Properties();
		
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		
		emf.setDataSource(dataSource);
		emf.setPackagesToScan("fr.formation.model");
		emf.setJpaVendorAdapter(vendorAdapter);
		emf.setJpaProperties(hibernateProperties);
		
		
		
		
		return emf;
	}
	
	//Configuration d u g e s t i o n n a i r e d e transactions
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		
		transactionManager.setEntityManagerFactory(emf);
		
		return transactionManager;
	}
}
