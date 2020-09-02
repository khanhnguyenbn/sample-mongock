package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("student")
@Data
public class Student {

    @Id
    private String id;

    private String name;

    @Field(name = "year_old")
    private int yearOld;

}
