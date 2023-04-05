package org.example.service;

import org.example.dao.CourseDao;
import org.example.dao.JdbcCourseDao;
import org.example.entity.Course;
import org.example.log.BaseLogger;

import java.util.List;


public class CourseManager {

    private final CourseDao courseDao;
    private BaseLogger[] loggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void add(Course course) throws Exception{
        if(course.getCoursePrice()<=0){
            throw new Exception("Ürün fiyatı pozitif sayı olmak zorunda!");
        }

        courseDao.add(course);

        for (BaseLogger logger : loggers){
            logger.log("Ürün eklendi");
        }
    }
}
