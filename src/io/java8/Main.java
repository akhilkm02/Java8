package io.java8;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Logger log=Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
       //Functional Interface
        MyFunctionalInterface myFunctionalInterface = (s1,s2)-> s1+s2;
        log.info(myFunctionalInterface.addString("Akhil"," Mohanan"));
        myFunctionalInterface.Print("Hello");//default method
        MyFunctionalInterface.PrintValue("Hello Static");//static method
    }
}