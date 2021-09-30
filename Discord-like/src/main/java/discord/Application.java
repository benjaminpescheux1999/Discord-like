package discord;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import discord.config.AppConfig;

public class Application {

	public static void main(String[] args) {
		System.out.println("Discord est actuellement en maintenance");
		
		
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
