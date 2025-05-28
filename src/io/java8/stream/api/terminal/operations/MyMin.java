package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class MyMin {
    public static final Logger log=Logger.getLogger(MyMin.class.getCanonicalName());

    public static void main(String[] args) {
        List<Student> students = GetAllStudentDetails.studentDetails();
       Optional<Student> s= students.stream().min((s1, s2)->{
           if( s1.getAge()>s2.getAge()){
               return 0;
           } else{
               return 1;
           }
        });
       log.info(s+"");

       Optional<Student> st=students.stream().min(Comparator.comparing(s1->s1.getAge()));
       log.info(st.toString());

    }

}
