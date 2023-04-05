package org.example.dao;

import org.example.entity.Course;

public class JdbcCourseDao implements CourseDao{
    public void add(Course course){
        System.out.println("JDBC ile eklendi");
    }
}
