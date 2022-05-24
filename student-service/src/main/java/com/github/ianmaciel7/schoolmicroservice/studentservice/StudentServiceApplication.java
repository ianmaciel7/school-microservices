package com.github.ianmaciel7.schoolmicroservice.studentservice;

import java.util.Arrays;
import java.util.List;

import com.github.ianmaciel7.schoolmicroservice.studentservice.models.Parent;
import com.github.ianmaciel7.schoolmicroservice.studentservice.models.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@RestController
	@RequestMapping("/students")
	class StudentController {

		@GetMapping("/list")
		public List<Student> list() {
			Parent parent = new Parent(1, "Marcos", "Silva Pereira", "71999823782");
			Student student = new Student(1, "Leonardo", "Silva Pereira", Arrays.asList(parent));
			return Arrays.asList(student);
		}
	}
}
