package io.java8.stream.api;

import io.java8.stream.api.helper.GetAllStudentDetails;
import io.java8.stream.api.helper.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyparallelStream {
    public static void main(String[] args) {
       // int i = 0;
       Stream<Integer> myStream= Stream.iterate(0, i->i+1).limit(100);
       List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       num.parallelStream().filter(i->i>-1).forEach(System.out::println);
    }
}
