package io.java8.stream.api.helper;

import java.util.ArrayList;
import java.util.List;

public class GetAllStudentDetails {

    private GetAllStudentDetails() {
    }

    public static List<Student> studentDetails() {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Create some Student objects
        List<String> student1Subjects = new ArrayList<>();
        student1Subjects.add("English");
        student1Subjects.add("Science");
        Student student1 = new Student("Alice", 10, 15, student1Subjects);

        List<String> student2Subjects = new ArrayList<>();
        student2Subjects.add("English");
        student2Subjects.add("History");
        student2Subjects.add("Geography");
        Student student2 = new Student("Bob", 9, 14, student2Subjects);

        List<String> student3Subjects = new ArrayList<>();
        student3Subjects.add("Computer Science");
        student3Subjects.add("Physics");
        student3Subjects.add("History");
        Student student3 = new Student("Charlie", 11, 16, student3Subjects);


        List<String> student4Subjects = new ArrayList<>();
        student3Subjects.add("Computer Science");
        student3Subjects.add("Physics");
        student3Subjects.add("History");
        Student student4 = new Student("Manoj", 11, 16, student3Subjects);

        // Add the Student objects to the ArrayList
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        return studentList;
    }
}
