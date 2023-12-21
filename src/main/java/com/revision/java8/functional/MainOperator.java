package com.revision.java8.functional;

public class MainOperator {

    public static void main(String[] args) {

        com.revision.java8.functional.MyOperator1 add = (a, b) -> a + b;
        com.revision.java8.functional.MyOperator1 multiply = (a, b) -> a * b;

        com.revision.java8.functional.MyOperator1 myOperatorImpl = new com.revision.java8.functional.MyOperatorImpl();

        System.out.println("Add: " + add.operation(3,4));
        System.out.println("Multiply: " + multiply.operation(3,4));
        System.out.println("Add default: " + myOperatorImpl.operation(3,4));

        myOperatorImpl.myDefaultMethod();




    }
}
