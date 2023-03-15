package org.example;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Andra!");

        printPeriodicallyCurrentDateAndTime();
    }

    public static void printPeriodicallyCurrentDateAndTime() {
        while (true) {
            try {
                System.out.println(Instant.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}