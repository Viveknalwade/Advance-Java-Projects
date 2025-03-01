package com.example.main;

//import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.example.main.entities.Student;
import com.example.main.service.StudentService;
import com.example.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithDataJpaApplication.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);

		// -------INSERTION--------------------------------------
//	Student std = new Student();
//	std.setName("Sanju");
//	std.setRollno(102);
//	std.setMarks(90.7f);
//	
//	boolean status = stdService.addStudentDetails(std);
//	if(status) {
//		System.out.println("Student inserted successfully");
//	}else {
//		System.out.println("Not inserted");
//	}
//	
		// ---------SELECT 1 ------------------------------
//	List<Student> stdList = stdService.getAllStdDetails();
//	for(Student std : stdList) {
//		System.out.println(std.getId());
//		System.out.println(std.getName());
//		System.out.println(std.getRollno());
//		System.out.println(std.getMarks());
//		System.out.println("-------------------------------");
//	}

		// ------------select 2------------------------------
//		Student std = stdService.getStdDetail(1L);
//		System.out.println(std.getId());
//		System.out.println(std.getName());
//		System.out.println(std.getRollno());
//		System.out.println(std.getMarks());

		
		//------------updation-----------------------------------
//		boolean status = stdService.updateStdDetail(2L, 95.5f);
//		if(status) {
//			System.out.println("Student marks updated");
//		}else {
//			System.out.println("Not updated");
//		}
		
		//--------------deletion--------------------
		boolean status = stdService.deleteStdDetail(1L);
		if(status) {
			System.out.println("Student deleted");
		}
		else {
			System.out.println("not deleted");
		}
	}

}
