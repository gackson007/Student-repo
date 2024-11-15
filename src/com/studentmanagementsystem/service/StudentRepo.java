package com.studentmanagementsystem.service;

import com.studentmanagementsystem.entity.Student;

import java.util.Scanner;

public class StudentRepo {
    SMSService service = new SMSService();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
          try {
              System.out.println("Welcome to Gabriel school");
              System.out.println("Press 1 to continue");
          }catch (Exception e ) {
              System.out.println("invalid response");
          }
            int open = scanner.nextInt();
//        scanner.nextLine();
//        if (open == 1) {
            while (open == 1) {
                try {
                    System.out.println("1. Add Student");
                    System.out.println("2. Get All Student");
                    System.out.println("3. Enroll Student");
                    System.out.println("4. Get All Enrollment");
                    System.out.println("5. Update Grade");
                    System.out.println("6. Update Attendance");
                    System.out.println("7. Find Student By Id");
                    System.out.println("8. Exit The Program");

                    int choice = scanner.nextInt();


                    switch (choice) {
                        case 1:
                            // add student
                            System.out.println("enter student id");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("enter student name");
                            String name = scanner.nextLine();
                            System.out.println("enter student email");
                            String email = scanner.nextLine();
                            System.out.println("enter student course");
                            String course = scanner.nextLine();

                            Student student = new Student(id, name, email, course);
                            service.addStudent(student);
                            break;

                        case 2:
                            //get all student
                            service.getAllStudent();
                            break;

                        case 3:
                            // enroll student
                            System.out.println("enter student id");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("enter student name");
                            String studentName = scanner.nextLine();
                            System.out.println("enter student email");
                            String studentEmail = scanner.nextLine();
                            System.out.println("enter the course of study you want");
                            String studentCourse = scanner.nextLine();
                            Student stud = new Student(studentId, studentName, studentEmail, studentCourse);
                            service.enrollStudent(stud);
                            break;
                        case 4:
                            // get all enrollments.
                            service.getAllEnrollment();
                            break;
                        case 5:
                            //update student grade.
                            System.out.println("enter student id");
                            studentId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("enter the course of study");
                            studentCourse = scanner.nextLine();
                            System.out.println("enter student grade");
                            double studentGrade = scanner.nextDouble();
                            service.updateGrade(studentId, studentCourse, studentGrade);
                            break;
                        case 6:
                            //update attendance
                            System.out.println("enter student id");
                            studentId = scanner.nextInt();
//                            scanner.nextLine();
                            System.out.println("enter the percentage for the student");
                            int percent = scanner.nextInt();
                            service.updateAttendance(studentId, percent);
                            break;
                        case 7:
                            //find student by id
                            System.out.println("enter student id");
                            studentId = scanner.nextInt();
                            service.getStudentById(studentId);
                            break;
                        case 8:
                            System.exit(0);
                        default:
                            System.out.println("invalid number");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
//        }
        }
    }




}
