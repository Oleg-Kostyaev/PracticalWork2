package com.javabasic.work24;

import java.util.Scanner;

public class Task24 {

    private static int expValue(int value, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return value;
        } else {
            return value * expValue(value, exp - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Функция находит и выводит на консоль разность между числом number и числом, составленным из цифр числа number, но взятых в обратном порядке");
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        int lenNumber = (int)Math.log10(inputNumber)+1;

        int outNumber = 0;
        int i = 0;
        int value = inputNumber;
        while (value > 0) {
            int digit = value % 10;
            i++;
            outNumber += digit * expValue(10,lenNumber-i);
            value = value / 10;
        }

        System.out.println(inputNumber+"-"+outNumber+"="+(inputNumber-outNumber));
    }

}
