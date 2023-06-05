package org.pictolearn.docker;

public class HelloWorldPing {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello Woorld ping " + i);
            Thread.sleep(1000);
        }
    }
}
