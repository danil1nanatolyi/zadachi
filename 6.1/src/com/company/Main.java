package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.println("Введите число: ");
        int number = in.nextInt();
    for (int i = 1; i <= 10; i++){
            System.out.println(number + "  " + i + " = " + number * i);
       }
    }
}
