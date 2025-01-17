package com.example.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entities.User;



public class App 
{
    public static void main( String[] args )
    {
//----------------INSERTION----------------------------------------------
    	User user1 = new User();
    	user1.setName("Viviku");
    	user1.setEmail("vivikujapan@gmail.com");
    	user1.setPassword("viviku@123");
    	user1.setGender("Male");
    	user1.setCity("Mumbai");
    
//    	user1.setName("Sanuju");
//    	user1.setEmail("sanujujapan@gmail.com");
//    	user1.setPassword("sanujuu@123");
//    	user1.setGender("Female");
//    	user1.setCity("Pune");
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("/com/example/config/hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory  = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();

    	
    	//--------------------------insertion -----------------------------------
//    	try {
//			session.save(user1);
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
    	
    	//----------------------selection----------------------------------- 
//    	try {
//			User user= session.get(User.class, 1L);
//			if(user != null) {
//				System.out.println(user.getId());
//				System.out.println(user.getName());
//				System.out.println(user.getEmail());
//				System.out.println(user.getPassword());
//				System.out.println(user.getGender());
//				System.out.println(user.getCity());
//			}else {
//				System.out.println("USER NOT FOUNDDDDD");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
    	
    	//----------------------------UPDATION-----------------------------------
//    	try {
//			User user= session.get(User.class, 2L);
//			user.setCity("Tokyo");
//			
//			session.saveOrUpdate(user);
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
    	
    	//-----------------------------delete-------------------------
    	try {
			User user= new User();
			user.setId(2);
			
			session.delete(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
    }
}
