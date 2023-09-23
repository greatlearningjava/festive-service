package com.greatlearning.algo.stack;

public class MyStack {

    private final int[] arr = new int[5];

    private int top = -1;

    public void push(int k) {
        if (top + 1 == 5) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = k;
        System.out.println("Element pushed is: " + k);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Overflow");
            return 999999999;
        }
        int val = arr[top];
        top--;
        return val;
    }

    public int size(){
        return top + 1;
    }
    public boolean empty(){
        if( top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void display(){
        while (!empty()){
            int val = pop();
            System.out.println(val);
        }

    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(23);
        stack.display();

//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());
//        System.out.println("Element pop is: " + stack.pop());




    }
}
