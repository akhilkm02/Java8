package io.java8.stream.api.terminal;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class MyNoneMatch {
    public static final Logger log=Logger.getLogger(MyNoneMatch.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        boolean chemFound=students.stream().noneMatch(x->x.getSubjects().contains("Chemestry"));
        log.info("Chemestry found "+chemFound);
    }
}
