package org.example.service;

import org.example.Course;
import org.example.Student;
import org.example.exceptions.EnrroledStudentException;

public interface AcademicService {


    public void enrolledStudent(Student student);
    public void addCourse(Course course);
    public void enrollStudentToCourse(Student student, Course course) throws EnrroledStudentException;

    public void unenrollStudentFromCourse(Course course, Student student);
}


