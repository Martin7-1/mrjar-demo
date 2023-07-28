package org.example;

public class HelloImpl implements Hello {

    @Override
    public String echoJavaVersion() {
        return System.getProperty("java.version");
    }
}
