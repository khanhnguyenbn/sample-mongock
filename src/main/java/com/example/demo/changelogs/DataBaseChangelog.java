package com.example.demo.changelogs;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@ChangeLog
public class DataBaseChangelog {

    @Autowired
    StudentRepository studentRepository;

    @ChangeSet(author = "system", id = "initNewFirstStudent", order = "001")
    public void createNewFirstStudent(MongockTemplate mongockTemplate) {

        Student student = new Student();
        student.setName("first name student");
        student.setYearOld(20);

        mongockTemplate.insert(student, "student");
    }

}
