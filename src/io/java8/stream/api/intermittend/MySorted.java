package io.java8.stream.api.intermittend;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MySorted {
    public static final Logger log=Logger.getLogger(FilterClass.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        List<String> li=students.stream().flatMap(s->s.getSubjects().stream()).sorted().collect(Collectors.toList());
        log.info(li.toString());
        List<Student> st3=students.stream().sorted(Comparator.comparing(student->student.getName())).collect(Collectors.toList());
        log.info(st3.toString());
    }

}
