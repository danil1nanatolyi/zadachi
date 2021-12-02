package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inputString = in.nextLine();int indexPoint = inputString.indexOf(".");
      String result = inputString.substring(0, indexPoint);   //Если надо с точкой, то +1
      System.out.println(result);
     int countSpace = 0;
      for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == ' '){
             countSpace++;
          }
       }
        System.out.println("Количество пробелов в исходной строке = " + countSpace);
    }
}