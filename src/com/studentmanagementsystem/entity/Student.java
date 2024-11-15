package com.studentmanagementsystem.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private Map<String, Double> grades;
    private int attendance;

    public Student() {
    }

    public Student(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.grades = new HashMap<>();
        this.attendance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(String subject, double grade) {
        grades.put(subject, grade);
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", grades=" + grades +
                ", attendance=" + attendance + "%" +
                '}';
    }
}
