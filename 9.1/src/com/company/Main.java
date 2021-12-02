package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        String strNumber = number + "";
        String string = "";
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            string = string + strNumber.charAt(i);
        }
        int reverse = Integer.parseInt(string);
        if (number == reverse) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}

