package io.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyOptional {
    public static void main(String[] args) {
        String name="Amal";
        Optional<String> nm=Optional.of(name);
        System.out.println(nm.isEmpty());
        System.out.println(nm.isPresent());

        List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<List<Integer>> li1=Optional.of(li);
        System.out.println(li.isEmpty());

    }
}
