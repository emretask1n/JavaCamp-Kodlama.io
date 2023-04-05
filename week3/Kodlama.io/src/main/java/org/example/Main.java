package org.example;


import org.example.dao.JdbcCourseDao;
import org.example.entity.Category;
import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.log.BaseLogger;
import org.example.log.ConsoleLogger;
import org.example.log.MailLogger;
import org.example.service.CourseManager;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course("Java",100,new Instructor("Engin"),new Category("Programming"));

        BaseLogger[] loggers = new BaseLogger[]{new ConsoleLogger(), new MailLogger()};
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course);
    }

}