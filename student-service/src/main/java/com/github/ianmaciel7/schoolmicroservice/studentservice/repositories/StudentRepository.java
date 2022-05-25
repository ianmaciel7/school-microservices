package com.github.ianmaciel7.schoolmicroservice.studentservice.repositories;

import com.github.ianmaciel7.schoolmicroservice.studentservice.models.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
