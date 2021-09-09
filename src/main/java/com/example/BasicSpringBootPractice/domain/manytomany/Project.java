//package com.example.BasicSpringBootPractice.domain.manytomany;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "Project")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Project {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//
//    @ManyToMany(mappedBy = "projects")
//    private List<Employee> employees = new ArrayList<>();
//
//}
//
