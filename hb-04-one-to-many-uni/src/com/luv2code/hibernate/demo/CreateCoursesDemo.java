package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		//create session factory

		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		//create session

		Session session=factory.getCurrentSession();

		try {      


			//start a transaction
			session.beginTransaction();

			//get the instructor from the db
			
			int theId=1;
			
			Instructor tempInstructor=session.get(Instructor.class,theId);
			
			//create some course
			
			Course temCourse1=new Course("Air Guiter - the Ultimate Guide");
			Course tempCourse2 =new Course("The Pinball Masterclass");
			
			//add courses to instructor
			tempInstructor.add(temCourse1);
			tempInstructor.add(tempCourse2);
			
			//save the courses
			session.save(temCourse1);
			session.save(tempCourse2);
			
			
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");

		}

		finally {

			//add clean up code
			session.close();
			factory.close();
		}

	}

}
