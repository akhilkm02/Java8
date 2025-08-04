package io.java.util;



import io.java8.stream.api.helper.Student;

import java.util.*;
import java.util.logging.Logger;

public class MyLists {
    private static final Logger log=Logger.getLogger(MyLists.class.getName());

    public static void main(String[] args) {


        //ArrayList
        log.info("Arraylist");
        List<Student> students= new ArrayList<>();
        students.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        students.add(new Student("Vimal",10,10, Arrays.asList("English","Maths")));
        students.forEach(student -> {
            log.info(students.toString());
        });


        //LinkedList
        log.info("Linkedlist");
        LinkedList<Student> st1=new LinkedList<>();
        st1.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        st1.add(new Student("Anil",10,10, Arrays.asList("English","Maths")));
        students.forEach(student -> {
            log.info(students.toString());
        });

        //Vector
        log.info("Vector");
        Vector<Student> st2=new Vector<>();
        st2.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        st2.add(new Student("Anil",10,10, Arrays.asList("English","Maths")));
        students.forEach(student -> {
            log.info(students.toString());
        });


    }
}
