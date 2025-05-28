package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class MyCount {
    public static final Logger log=Logger.getLogger(MyCount.class.getName());
    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        long totalStudents=students.stream().filter(x->x.getName().startsWith("A")).count();
        log.info(String.valueOf(totalStudents));
    }
}
