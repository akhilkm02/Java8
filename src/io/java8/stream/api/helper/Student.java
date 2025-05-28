package io.java8.stream.api.helper;

import java.util.List;

public class Student {
    private String name;
    private int standard;
    private int age;
    private List<String> subjects;

    public Student() {

    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Student(String name, int standard, int age, List<String> subjects) {
        this.name = name;
        this.standard = standard;
        this.age = age;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", standard=" + standard +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}
