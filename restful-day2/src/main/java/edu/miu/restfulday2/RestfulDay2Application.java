package edu.miu.restfulday2;

import edu.miu.restfulday2.entity.Student;
import edu.miu.restfulday2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//public class RestfulDay2Application implements CommandLineRunner {
public class RestfulDay2Application {



	public static void main(String[] args) {
		SpringApplication.run(RestfulDay2Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> studentList = StudentRepo.studentList;
//		System.out.println();
//	}
}
