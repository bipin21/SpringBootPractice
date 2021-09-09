//package com.example.BasicSpringBootPractice.domain.manytomany;
//
//import com.example.BasicSpringBootPractice.domain.onetoone.Phone;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Entity
//@Table(name = "Employee")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//
//    @ManyToMany
//    @JoinTable()
//    private List<Project> projects = new ArrayList<>();
//}