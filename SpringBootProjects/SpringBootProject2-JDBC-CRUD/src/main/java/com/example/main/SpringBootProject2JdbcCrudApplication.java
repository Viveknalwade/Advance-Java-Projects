package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.main.dao.UserDao;
import com.example.main.entity.User;

@SpringBootApplication
public class SpringBootProject2JdbcCrudApplication implements CommandLineRunner {
	
	@Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject2JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//------------------------------INSERTION---------------------------------
//		User user1 = new User("Vivek","Vivi@gmail.com","Male","Kayamkulam");
//		User user2 = new User("Sanju","Sanju@gmail.com","Female","Sangli");
//		boolean status = userDao.insertUser(user2);
//		if(status) {
//			System.out.println("User inserted successfully");
//		}else {
//			System.out.println("User not inserted");
//		}
		//------------------------------UPDATION----------------------------------
//		User user1 = new User("Sanju","Vivi23@gmail.com","Female","Kallummoodu");
//		boolean status = userDao.updateUser(user1);
//		if(status)
//		{
//			System.out.println("User updated successfully");
//		}
//		else {
//			System.out.println("User not updated");
//		}
		
		//updation 2
		User user = userDao.getUserByEmail("Sanju@gmail.com");
		user.setCity("Pune");
		boolean status = userDao.updateUser(user);
		if(status)
			{
				System.out.println("User updated successfully");
			}
			else {
				System.out.println("User not updated");
			}
		//------------------------------------------------------------------------
		
		//-------------------------------DELETION---------------------------------
//		boolean status = userDao.deleteUserByEmail("Vivi23@gmail.com");
//		if(status) {
//			System.out.println("user deleted successfully");
//		}
//		else {
//			System.out.println("user not deleted");
//		}
		
		//---------------------SELECTING ONE USER------------------------------------
//		User user = userDao.getUserByEmail("Vivi@gmail.com");
//		System.out.println("Name : "+user.getName());
//		System.out.println("Email : "+user.getEmail());
//		System.out.println("Gender : "+user.getGender());
//		System.out.println("City : "+user.getCity());
		//------------------------------------------------------------------------------
 
		//---------SELECTING ALL USER
//		List<User> list = userDao.getAllUser();
//		for(User user : list) {
//			System.out.println("Name : "+user.getName());
//			System.out.println("Email : "+user.getEmail());
//			System.out.println("Gender : "+user.getGender());
//			System.out.println("City : "+user.getCity());
//			System.out.println("------------------------------------------------");
//		}
	}

}
  