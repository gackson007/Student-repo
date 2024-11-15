package com.studentmanagementsystem.service;

import com.studentmanagementsystem.entity.Enrollment;
import com.studentmanagementsystem.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class SMSService {
    private List<Student> students = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();

    public SMSService() {
    }

    public SMSService(List<Student> students, List<Enrollment> enrollments) {
        this.students = students;
        this.enrollments = enrollments;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added Successfully");
    }
    public void getAllStudent() {
        for (Student student : students) {
            System.out.println(student);
            if (students.isEmpty()) {
                System.out.println("There are no student in the school");
            } else if (students.size() == 1) {
                System.out.println("There are " + students.size() + " student in the school");
            }else
            {
                System.out.println("There are " + students.size() + " students in the school");
            }
        }
    }
    public void enrollStudent(Student student) {
        Enrollment enrollment = new Enrollment(enrollments.size() + 1, student);
        enrollments.add(enrollment);
        System.out.println("student enrolled successfully");
    }
    public void getAllEnrollment() {
        if (enrollments.isEmpty()) {
            System.out.println("no enrollment available");
        }else {
            for (Enrollment enrollment : enrollments) {
                System.out.println(enrollment.toString());
                if (enrollments.size() == 1) {
                    System.out.println("There are " + enrollments.size() + " student that got enrolled to the school");
                }else {
                    System.out.println("There are " + enrollments.size() + " students that got enrolled to the school");
                }

            }
        }

    }
    public void updateGrade(int studentID, String subject, double grade) {
        try {
            Student student = findStudentById(studentID);
            if (student != null) {
                student.setGrades(subject, grade);
                System.out.println("Updated grade for student " + studentID + " : " + subject + " : " + grade);
            }else {
                System.out.println("student not found");
            }
//            throw new Exception("id not found");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateAttendance(int studentID, int attendancePercentage) {
        Student student = findStudentById(studentID);
        if (student != null) {
            student.setAttendance(attendancePercentage);
            System.out.println("Updated attendance for student " + studentID + " : " + attendancePercentage + "%");
        }else {
            System.out.println("Student not found.");
        }
    }

    private Student findStudentById(int studentID) {
        for (Student student : students) {
            if (student.getId() == studentID) {
                return student;
            }
        }
        return null;
    }
    public void getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student.toString());
            }
        }
    }


}
