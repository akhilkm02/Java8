package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class MyAnyMatch {
    public static final Logger log=Logger.getLogger(MyCollect.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        boolean englishFound= students.stream().anyMatch(x->x.getSubjects().contains("English"));
        log.info("English Found is "+englishFound);
    }

}
