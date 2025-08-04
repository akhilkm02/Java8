package io.java8.stream.api.intermittend;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyDistinct {
    public static final Logger log=Logger.getLogger(MyDistinct.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        List<String>st2=students.stream().flatMap(s->s.getSubjects().stream()).distinct().collect(Collectors.toList());
        log.info(st2.toString());
    }

    public static class TestLimit {
    }
}
