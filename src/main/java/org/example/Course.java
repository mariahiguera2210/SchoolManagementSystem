package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {

    private int idCourse;
    private String courseName;
    private String description;
    private int credits;
    private int vertion;





    public Course(int idCourse, String courseName, String description, int credits, int vertion) {
        this.idCourse = idCourse;
        this.courseName = courseName;
        this.description = description;
        this.credits = credits;
        this.vertion = vertion;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setNameCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getVertion() {
        return vertion;
    }

    public void setVertion(int vertion) {
        this.vertion = vertion;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", credits=" + credits +
                ", vertion=" + vertion +
                '}';
    }
}
