package com.revision.java8.multiple.Inheritance;

public interface InterfaceFoo {

    public default void hello(){
        System.out.println("Hello InterfaceFoo !!!");
    }
}
