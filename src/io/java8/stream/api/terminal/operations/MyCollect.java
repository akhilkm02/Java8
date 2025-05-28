package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;
import io.java8.stream.api.intermittend.operations.FilterClass;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyCollect {
    public static final Logger log=Logger.getLogger(MyCollect.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        List<String> li=students.stream().map(s -> s.getName()).collect(Collectors.toList());
        log.info(li.toString());
    }
}
