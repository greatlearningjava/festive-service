package com.revision.java8.functional;

public class MyOperatorImpl implements com.revision.java8.functional.MyOperator2, com.revision.java8.functional.MyOperator1 {

    @Override
    public int operation(int a, int b) {

        return a + b;
    }
}
