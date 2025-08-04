package myjava.util;



import io.java.util.MyLists;
import io.java8.stream.api.helper.Student;

import java.util.*;
import java.util.logging.Logger;

public class MyQueue {
    private static final Logger log=Logger.getLogger(MyLists.class.getName());
    public static void main(String[] args) {
        //LinkedList
        log.info("Arraylist");
        Queue<Student> students= new LinkedList<>();
        students.add(new Student("Amal",10,10, Arrays.asList("English","Maths")));
        students.add(new Student("Vimal",10,10, Arrays.asList("English","Maths")));
        System.out.println(students.poll()); //Retrieves and removes head (returns null if empty)
        System.out.println(students.peek()); // Retrieves head without removing (returns null if empty)
        students.forEach(student -> {
            log.info(students.toString());
        });
    }
}
