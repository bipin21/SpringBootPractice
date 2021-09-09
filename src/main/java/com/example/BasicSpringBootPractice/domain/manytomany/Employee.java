package com.example.BasicSpringBootPractice.domain.manytomany;

import com.example.BasicSpringBootPractice.domain.onetoone.Phone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    // OneToMany bidirectional with column
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "project_id")
//    private Project project;

    // OneToMany bidirectional with table
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Project project;
}