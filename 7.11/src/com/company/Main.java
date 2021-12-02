package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число типа double: ");
        Scanner in = new Scanner(System.in);
       double number = in.nextDouble();
        if (number % 1 == 0){
            System.out.println("Введённое число является целым");
        } else {
           System.out.println("Введённое число не является целым");
       }
    }
}
