package com.studentmanagementsystem.entity;

public class Enrollment {
    private int id;
    private Student student;

    public Enrollment() {
    }

    public Enrollment(int id, Student student) {
        this.id = id;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }
}
