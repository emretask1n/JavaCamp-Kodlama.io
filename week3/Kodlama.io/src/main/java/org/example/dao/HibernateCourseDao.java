package org.example.dao;

import org.example.entity.Course;

public class HibernateCourseDao implements CourseDao{
    public void add(Course course){
        System.out.println("Hibernate ile veri eklendi");
    }
}
