package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        task2(numbers, 3);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void task2(int[] array, int number) {
        array[number] = (int) (array[number] * 0.1) + array[number];
    }
}

