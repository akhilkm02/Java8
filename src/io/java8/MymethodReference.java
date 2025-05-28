package io.java8;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;

public class MymethodReference {
    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        students.forEach(System.out::println);
        System.out.println();
        System.out.println();
        students.stream().forEach(s->System.out.println(s.getName()));
    }
}
