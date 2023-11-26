package org.example;

import org.example.exceptions.EnrroledStudentException;
import org.example.service.AcademicService;

import java.util.*;

public class AcademicManager implements AcademicService {

    List<Student> studentsList = new ArrayList<>();
    List<Course> coursesList = new ArrayList<>();
    Map<Course, List<Student>> studentsData = new Hashtable<>();

    @Override
    public void enrolledStudent(Student student) {
            if(studentsList.contains(student)){
                System.out.println("El estudiante ya esta registrado ");

            }else {
                studentsList.add(student);
                System.out.println("Estudiante ha sido agregado " + student);
            }
        }


    @Override
    public void addCourse(Course course) {
            if(coursesList.contains(course)){
                System.out.println("El curso ya esta registrado");
                System.out.println(course);
            }else {
                coursesList.add(course);
                studentsData.put(course, new ArrayList<>());
                System.out.println("Curso registrado: " + course);

        }
    }

    @Override
    public void enrollStudentToCourse(Student student, Course course) throws EnrroledStudentException {

        if (studentsData.containsKey(course)) {

            List<Student> enrolledStudents = studentsData.get(course);

            if (enrolledStudents.contains(student)) {
                System.out.println("El estudiante ya está inscrito en el curso " + course.getCourseName());
                return;
            }
            enrolledStudents.add(student);
        } else {
            List<Student> newEnrollment = new ArrayList<>();
            newEnrollment.add(student);
            studentsData.put(course, newEnrollment);
        }
        System.out.println("Inscripción exitosa para el estudiante " + student.getName() +
                " en el curso " + course.getCourseName());
    }
    public void showList(){
        System.out.println(studentsData);
    }
    @Override
    public void unenrollStudentFromCourse(Course course, Student student) {

        List<Student> students = studentsData.get(course);
        if (students == null || !students.contains(student)) {
            System.out.println("Student not enrolled in course");
        } else {
            students.remove(student);
            System.out.println("Unenrolled student");
        }


    }


    @Override
    public String toString() {
        return "AcademicManager{" +
                "studentsData=" + studentsData +
                '}';
    }
}
