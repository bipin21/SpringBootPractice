package com.example.BasicSpringBootPractice.domain.manytomany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private int id;


    //OneToMany unidirectional with column
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @Fetch(FetchMode.JOIN)
//    @JoinColumn(name = "project_id")
//    private List<Employee> employees;


    //OneToMany bidirectional with column
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "project")
//    @Fetch(FetchMode.JOIN)
//    private List<Employee> employees;

    // OneToMany uni/bidirectional with table
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinTable
    private List<Employee> employees;

}

