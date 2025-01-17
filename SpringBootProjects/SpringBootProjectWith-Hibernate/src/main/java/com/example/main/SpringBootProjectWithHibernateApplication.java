package com.example.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.main.entities.User;
import com.example.main.repository.DbOperation;

@SpringBootApplication
public class SpringBootProjectWithHibernateApplication {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(SpringBootProjectWithHibernateApplication.class, args);
	DbOperation dbop =  context.getBean(DbOperation.class);
	User user = dbop.getUserDetails(1L);
	if(user != null) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
	}
	else {
		System.out.println("User not found");
	}
	
	
	}

}
