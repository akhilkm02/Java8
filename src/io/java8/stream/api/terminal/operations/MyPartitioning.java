package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyPartitioning {
    public static final Logger log=Logger.getLogger(MyPartitioning.class.getSimpleName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        Map<Boolean,List<Student>> st=students.stream().collect(Collectors.partitioningBy(s->s.getAge()>15));
        log.info(st.toString());
    }
}
