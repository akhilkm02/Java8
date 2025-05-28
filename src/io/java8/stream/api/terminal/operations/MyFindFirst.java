package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class MyFindFirst {
    public static final Logger log=Logger.getLogger(MyFindFirst.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        Optional<Student> st=students.stream().filter(x->x.getAge()==14).findFirst();
        if(st.isEmpty()) {
            log.info("Student  Found");
        }else {
            log.info("Student Found "+ st);
        }
    }
}
