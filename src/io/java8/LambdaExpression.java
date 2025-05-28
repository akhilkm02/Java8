package io.java8;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable= ()-> System.out.println("I am here !");
        Thread t= new Thread(runnable);
        t.start();
    }
}
