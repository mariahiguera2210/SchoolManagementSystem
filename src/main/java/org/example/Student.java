package org.example;

import org.example.service.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {


    private int idStudent;
    private String name;
    private String lastName;
    private String birthdayDate;
    private State state;




    public Student(int idStudent, String name, String lastName, String birthdayDate, State state) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.state = state;


    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public State getState() {
        return state;
    }


    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}


