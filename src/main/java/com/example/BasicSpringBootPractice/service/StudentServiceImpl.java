package com.example.BasicSpringBootPractice.service;


import com.example.BasicSpringBootPractice.domain.manytomany.Student;
import com.example.BasicSpringBootPractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Student> findAllByfirstName(String name) {
        return studentRepository.findStudentsByFirstName(name);
    }

    @Override
    public List<Student> findAllByCourseId(String id) {
        return studentRepository.findAllByCourseId(id);
    }

    @Override
    public List<Student> findAllgpa(double gpa) {
        return studentRepository.findAllgpa(gpa);
    }

    @Override
    public List<Student> findStudentsByFirstNameStartingWith(String startwith) {
        return studentRepository.findStudentsByFirstNameStartingWith(startwith);
    }

    @Override
    public List<Student> findAllbetweengpa(double lowergpa, double highgpa) {
        return studentRepository.findAllbetweengpa(lowergpa,highgpa);
    }
}
