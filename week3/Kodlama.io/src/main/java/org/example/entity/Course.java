package org.example.entity;

public class Course {
    private String courseName;
    private int coursePrice;
    private Instructor instructor;
    private Category category;

    public Course() {
    }

    public Course(String courseName, int coursePrice, Instructor instructor, Category category) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructor = instructor;
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
