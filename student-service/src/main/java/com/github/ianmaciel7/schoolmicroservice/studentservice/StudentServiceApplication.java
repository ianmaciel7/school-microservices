package com.github.ianmaciel7.schoolmicroservice.studentservice;

import java.util.Arrays;
import java.util.List;

import com.github.ianmaciel7.schoolmicroservice.studentservice.models.Student;
import com.github.ianmaciel7.schoolmicroservice.studentservice.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableJpaRepositories("com.github.ianmaciel7.schoolmicroservice.studentservice.repositories")
@EnableEurekaClient
@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@RestController
	@RequestMapping("/students")
	class StudentController {

		@Autowired
		private StudentRepository studentRepository;

		@GetMapping("/list")
		public Iterable<Student> list() {

			Iterable<Student> students = studentRepository.findAll();
			return students;
		}
	}
}
