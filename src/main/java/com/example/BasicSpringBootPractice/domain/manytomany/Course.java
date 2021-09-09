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
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
//    @Column(name = "course_id")
    String id;

    String courseName;

    @ManyToMany
    @JoinTable
    @Fetch(FetchMode.JOIN)
    List<Student> roster;


}
