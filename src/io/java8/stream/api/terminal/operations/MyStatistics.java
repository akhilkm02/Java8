package io.java8.stream.api.terminal.operations;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyStatistics {
    public static final Logger log=Logger.getLogger(MyStatistics.class.getSimpleName());

    public static void main(String[] args) {
        List<Student> students= GetAllStudentDetails.studentDetails();
        DoubleSummaryStatistics st= students.stream().collect(Collectors.summarizingDouble(s->s.getAge()));

        log.info("Avg Age is "+st.getAverage());

    }

}
