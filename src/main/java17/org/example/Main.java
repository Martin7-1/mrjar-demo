package org.example;

import org.example.Hello;
import org.example.HelloImpl;

public class Main {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        System.out.println("run on jdk 17");
        System.out.printf("java version is %s", hello.echoJavaVersion());
    }
}