package com.sms.studentmanagement;

import com.sms.studentmanagement.dao.StudentRepository;
import com.sms.studentmanagement.entity.Role;
import com.sms.studentmanagement.entity.Student;
import com.sms.studentmanagement.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class StudentManagementApplication  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Student st1= new Student("Anna","Smith","a@gmail.com");
//		Student st2= new Student("Maria","Jones","m@gmail.com");
//		Student st3= new Student("Linda","Kaveh","l@gmail.com");
//		studentRepository.save(st1);
//		studentRepository.save(st2);
//		studentRepository.save(st3);
//		}
}
