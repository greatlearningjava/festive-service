package com.revision.java8.multiple.Inheritance;

@FunctionalInterface
public interface InterfaceBar {

    public default void hello(){
        System.out.println("Hello InterfaceBar !!!");
    }
    public boolean test(String word);
}
