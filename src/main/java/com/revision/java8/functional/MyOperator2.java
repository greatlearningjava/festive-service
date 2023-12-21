package com.revision.java8.functional;

@FunctionalInterface
public interface MyOperator2 extends com.revision.java8.functional.MyOperator1 {

    @Override
    default void myDefaultMethod(){
        com.revision.java8.functional.MyOperator1.super.myDefaultMethod();
        System.out.println("MyOperator2 Interface");
    }

    // we can override the method of the above class, but no advantage of doing it.
    int operation(int a, int b);

    //Multiple non-overriding abstract methods found in interface com.revision.MyOpertator2
    //void display();
}
