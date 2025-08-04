package io.java8.stream.api.intermittend;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyFlatMap {
    public static final Logger log=Logger.getLogger(MyFlatMap.class.getName());
    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        List<String> st1=students.stream().flatMap(s->s.getSubjects().stream()).collect(Collectors.toList());
        log.info(st1.toString());
    }

}
