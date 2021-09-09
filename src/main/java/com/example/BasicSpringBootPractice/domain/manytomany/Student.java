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
@Table()
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    long id;

    @Column(name="F_NAME")
    String firstName;
    String L_Name;

    double gpa;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "roster")
    List<Course> courses;
}
