package com.example.BasicSpringBootPractice.service;

import com.example.BasicSpringBootPractice.domain.manytomany.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentService {


    public List<Student> getAll();

    public List<Student> findAllByfirstName(String name);

    public List<Student> findAllByCourseId(String id);

    public List<Student> findAllgpa(double gpa);

    public List<Student> findStudentsByFirstNameStartingWith(String startwith);

    public List<Student> findAllbetweengpa(double lowergpa, double highgpa);
}
