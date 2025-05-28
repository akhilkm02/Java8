package io.java8.stream.api.intermittend.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyMap {
    public static final Logger log=Logger.getLogger(MyMap.class.getName());
    public static void main(String[] args){

        List<Student> students= GetAllStudentDetails.studentDetails();
        List<List<String>> st=students.stream().filter(x->x.getStandard()>9).map(Student::getSubjects).collect(Collectors.toList());
        log.info(st.toString());


    }
}
