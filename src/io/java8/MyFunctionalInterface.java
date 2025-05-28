package io.java8;

import java.util.logging.Logger;

@FunctionalInterface
public interface MyFunctionalInterface {
    Logger log= Logger.getLogger(MyFunctionalInterface.class.getCanonicalName());
    public String addString(String s1,String s2);
    public default void Print(String s){
        log.info(s);
    }
    public static void PrintValue(String s){
        log.info(s);
    }

}
