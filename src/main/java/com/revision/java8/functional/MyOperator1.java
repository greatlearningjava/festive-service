package com.revision.java8.functional;

@FunctionalInterface
public interface MyOperator1 {

    default void myDefaultMethod(){
        System.out.println("MyOperator1 Interface");
    }

    int operation(int a, int b);

}
