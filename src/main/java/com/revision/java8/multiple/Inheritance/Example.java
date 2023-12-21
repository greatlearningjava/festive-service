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

    public static void main(String[] args) {
        new Example().hello();
        new Example().display();
    }
}
