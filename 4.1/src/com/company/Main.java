package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
         double speed = 1234.8;
          System.out.println("Введите интервал: ");
         double interval = in.nextDouble();
        System.out.println(speed * interval / 3600);
    }
}
