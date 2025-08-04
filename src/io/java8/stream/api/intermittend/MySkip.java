package io.java8.stream.api.intermittend;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class MySkip {
    public static final Logger log=Logger.getLogger(MySkip.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        List<Student> st=students.stream().skip(2).toList();
        log.info(st.toString());
    }
}
