package io.java8.stream.api.intermittend.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FilterClass {
    public static final Logger log=Logger.getLogger(FilterClass.class.getName());
    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        log.info(students.toString());
        List<Student>   students1=students.stream().filter(x->x.getAge()>15).collect(Collectors.toList());
        log.info(students1.toString());
        List<Student>  students2=students.stream().filter(x->x.getSubjects().contains("Mathematics")).collect(Collectors.toList());
        log.info(students2.toString());
    }

}
