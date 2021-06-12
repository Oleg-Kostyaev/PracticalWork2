package com.javabasic.work22;

public class Task22 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis() / 1000;
        long sec = currentTime % 60;
        currentTime /= 60;
        long min = currentTime % 60;
        currentTime /= 60;
        long hour = currentTime % 24;
        currentTime /=24;
        System.out.println("dd:hh:mm:ss ->" + currentTime +":"+ hour+":" + min+":" + sec);
//        System.out.println(sec);
//        System.out.println(min);
//        System.out.println(hour);
    }
}
