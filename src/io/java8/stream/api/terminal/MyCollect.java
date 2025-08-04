package io.java8.stream.api.terminal;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

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
