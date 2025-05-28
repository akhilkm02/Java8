package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.logging.Logger;

public class MyReduce {
    public static final Logger log =Logger.getLogger(MyReduce.class.getName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        Student st= students.stream().filter(s->s.getSubjects().contains("English"))
                .reduce(new Student(),(s1,s2)->{
                    if(s1.getName()==null)s1.setName("");
                    s1.setName(s1.getName()+","+s2.getName());
                    return s1;
                } );
        log.info("Students "+ st.getName().replaceFirst(",",""));
    }
}
