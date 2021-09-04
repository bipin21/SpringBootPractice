package com.example.BasicSpringBoot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    int id;
    String title;
    String content;
    String author;
}
