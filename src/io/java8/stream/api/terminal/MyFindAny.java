package io.java8.stream.api.terminal;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class MyFindAny {
    public static final Logger log=Logger.getLogger(MyFindAny.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        Optional<Student> st=students.stream().filter(x->x.getSubjects().contains("English")).findAny();
        log.info("Student Found "+st);
    }
}
