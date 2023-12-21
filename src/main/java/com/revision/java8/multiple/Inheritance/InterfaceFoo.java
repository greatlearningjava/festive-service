package com.revision.java8.multiple.Inheritance;

@FunctionalInterface
public interface InterfaceFoo {

    public default void hello(){
        System.out.println("Hello InterfaceFoo !!!");
    }
    public boolean test(String word);
}
