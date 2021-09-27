package discord;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.formation.config.AppConfig;

public class Application {

	public static void main(String[] args) {
		System.out.println("Discord est actullement en maintenance");
		
		
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
