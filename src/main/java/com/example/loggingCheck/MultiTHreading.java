package com.example.loggingCheck;

public class MultiTHreading {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("From Thread 1");
            }
        );

        Thread t2 = new Thread(() -> {
            System.out.println("From Thread 1");
        }
        );

        t1.start();
        t2.start();
    }
}
