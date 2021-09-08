package com.example.BasicSpringBootPractice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "POST")
public class Post {
    @Id
    int id;
    String title;
    String content;
    String author;
}
