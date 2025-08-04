package io.java8.stream.api.terminal;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class MyForEach {
    public static final Logger log = Logger.getLogger(MyForEach.class.getName());

    public static void main(String[] args) {
        List<Student> students = GetAllStudentDetails.studentDetails();
        AtomicInteger i = new AtomicInteger();
        students.forEach((s)->{
            log.info(s.getName() +" "+ i.getAndIncrement() +" !" );
        });
    }
}
