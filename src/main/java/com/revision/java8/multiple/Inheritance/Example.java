package com.revision.java8.multiple.Inheritance;

public class Example extends ParentClass implements InterfaceFoo, InterfaceBar {

    public void display(){
        super.hello();
        InterfaceFoo.super.hello();
        InterfaceBar.super.hello();
    }

    @Override
    public void hello(){
        super.hello();
        InterfaceFoo.super.hello();
        InterfaceBar.super.hello();
    }

    @Override
    public boolean test(String word) {
        System.out.println("    Inside Example test ");
        InterfaceFoo.super.hello();
        return false;
    }

    public static void main(String[] args) {
        new Example().hello();
        new Example().display();
        new Example().test("Right");
        InterfaceFoo i = (word -> word.isEmpty());
        System.out.println(i.test(""));
        System.out.println(i.test("Right"));

    }
}
