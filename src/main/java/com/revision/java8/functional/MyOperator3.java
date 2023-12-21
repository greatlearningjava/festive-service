package com.revision.java8.functional;

public interface MyOperator3 extends com.revision.java8.functional.MyOperator1, com.revision.java8.functional.MyOperator2 {

    @Override
    default void myDefaultMethod() {
        com.revision.java8.functional.MyOperator2.super.myDefaultMethod();
        System.out.println("In MyOperator3");
    }
}
