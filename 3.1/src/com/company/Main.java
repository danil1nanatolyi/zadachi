package com.company;

public class Main {

    public static void main(String[] args) {
        double euro = convertToEuro(100, 68.5);
        System.out.println(euro);
    }

    public static double convertToEuro(double rubl, double course) {
        return rubl * course;
    }
}