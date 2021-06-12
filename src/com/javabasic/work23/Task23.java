package com.javabasic.work23;

public class Task23 {
    public static void main(String[] args) {
        int value1 = 1008;
        int value2 = -78;

        System.out.println("value1 = " + value1 + "\nvalue2 = " + value2);
        System.out.println("--------------------------");
        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;

        System.out.println("value1 = " + value1 + "\nvalue2 = " + value2);

    }
}
