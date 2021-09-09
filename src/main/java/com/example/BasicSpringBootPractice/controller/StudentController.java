package com.example.BasicSpringBootPractice.controller;

import com.example.BasicSpringBootPractice.domain.manytomany.Student;
import com.example.BasicSpringBootPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/findAllByFirstName")
    public List<Student> findAllByF_NAME(@RequestParam("name") String name){
        System.out.println(name);
        return studentService.findAllByfirstName(name);
    }

    @GetMapping("/findAllByCourseId")
    public List<Student> findAllByCourseId(@RequestParam("id") String id){
        System.out.println(id);
        return studentService.findAllByCourseId(id);
    }

    @GetMapping("/findAllgpa")
    public List<Student> findAllgpa(@RequestParam("gpa") double gpa){
        System.out.println(gpa);
        return studentService.findAllgpa(gpa);
    }

    @GetMapping("/findAllbetweengpa")
    public List<Student> findAllbetweengpa(@RequestParam("lowergpa") double lowergpa, @RequestParam("highgpa") double highgpa){
        return studentService.findAllbetweengpa(lowergpa,highgpa);
    }

    @GetMapping("/findStudentsByFirstNameStartingWith")
    public List<Student> findStudentsByFirstNameStartingWith(@RequestParam("startwith") String startwith){
        System.out.println(startwith);
        return studentService.findStudentsByFirstNameStartingWith(startwith);
    }
}
