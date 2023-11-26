package org.example;

import org.example.exceptions.EnrroledStudentException;
import org.example.service.State;

public class Main {
    public static void main(String[] args) throws EnrroledStudentException {


        AcademicManager academicManager = new AcademicManager();


        Course course = new Course(1, "matematicas", "sumar", 3,3);
        Course course1= new Course(2, "español", "español", 5,2);
        Student student = new Student(1,"Maria", "Higuera", "2222", State.MATRICULADO);
        Student student1= new Student(2, "Harry", "Potter", "22/09/1996", State.INACTIVO);
        Course course2 = new Course(3, "Posiones", "posiones", 5, 3);


try {
    academicManager.addCourse(course);
    academicManager.addCourse(course1);
    academicManager.addCourse(course2);
    academicManager.enrolledStudent(student);
    academicManager.enrolledStudent(student1);
    academicManager.enrollStudentToCourse(student, course);
    academicManager.enrollStudentToCourse(student, course);
    academicManager.enrollStudentToCourse(student, course1);
    academicManager.enrollStudentToCourse(student1, course2);
    academicManager.unenrollStudentFromCourse(course1, student);


} catch (EnrroledStudentException error) {
    System.out.println("No se inscribio el estudiante al curso " + error.getMessage());
}
    academicManager.showList();
    }
}