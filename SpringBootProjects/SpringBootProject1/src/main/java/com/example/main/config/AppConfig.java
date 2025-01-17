package com.example.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.main.beans.Student;

@Configuration
public class AppConfig {
	
	@Bean 
	public CommandLineRunner cmdLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				stdBean().displayStdDetails();
			}
		};
		
	}
	
	@Bean
	public Student stdBean() {
		return new Student("Vivek",1171,95.2f);
	}
}
