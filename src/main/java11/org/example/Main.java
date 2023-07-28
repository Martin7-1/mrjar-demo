package org.example;

public class Main {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        System.out.println("run on jdk 11");
        System.out.printf("java version is %s", hello.echoJavaVersion());
    }
}