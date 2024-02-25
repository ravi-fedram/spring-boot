package com.pracrice.onetoone;

import com.pracrice.onetoone.dao.InstructorDao;
import com.pracrice.onetoone.entity.Instructor;
import com.pracrice.onetoone.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(InstructorDao instructorDao){

		return runner -> {

					//createInstructor(instructorDao);
					//findInstructor(instructorDao);
					//findInstructorDetails(instructorDao);
					//deleteInstructor(instructorDao);
					  deleteInstructorDetails(instructorDao);
        };
	}

	private void deleteInstructorDetails(InstructorDao instructorDao) {
		int instructorDetailsId = 100;
		System.out.println("Deleting profile details for Id "+instructorDetailsId);
		instructorDao.deleteInstructorDetailsById(instructorDetailsId);
	}

	private void deleteInstructor(InstructorDao instructorDao) {
		int instructorId = 103;
		System.out.println("Instructor Details for Id "+instructorId);
		instructorDao.deleteInstructorById(instructorId);
	}

	private void findInstructorDetails(InstructorDao instructorDao) {
		int instructorDetailsId = 101;
		System.out.println("Instructor profile details for Id "+instructorDetailsId);
		InstructorDetail temp = instructorDao.findInstructorDetailsById(instructorDetailsId);
		System.out.println(temp);
	}

	private void findInstructor(InstructorDao instructorDao) {
		int instructorId = 101;
		System.out.println("Instructor Details for Id "+instructorId);
		Instructor tempInstructor = instructorDao.findInstructorById(instructorId);
		System.out.println("Instructor details : "+tempInstructor);
	}

	private void createInstructor(InstructorDao instructorDao) {
//		Instructor tempInstructor= new Instructor("Kailash","Fedram","kailash.fedram@gmail.com");
//		InstructorDetail tempInstructorDetail = new InstructorDetail("Advance Java","chatting");
//
//		tempInstructor.setInstructorDetail(tempInstructorDetail);
//		System.out.println("Saving instructor to db"+tempInstructor);
//		instructorDao.Save(tempInstructor);

		System.out.println("Please find instructor details for ID 101");
		InstructorDetail temp = instructorDao.findInstructorDetailsById(101);
		System.out.println("profile of instructor 101");
		System.out.println(temp.toString());
		System.out.println("Instructor details");
		System.out.println(temp.getInstructor());

	}

}
