package io.java8.stream.api.intermittend;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class TestLimit {
    public static final Logger log=Logger.getLogger(TestLimit.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        log.info(students.toString());
        List<Student> st=students.stream().limit(1).toList();
        log.info(st.toString());
    }

}
