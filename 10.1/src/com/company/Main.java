package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           System.out.println("Введите строку: ");
            String str = in.nextLine();
         checkString(str);
         }


   public static void checkString(String inputString){
     String string = "";
      for (int i = inputString.length() - 1; i >= 0; i--){
      string = string + inputString.charAt(i);
  }
      if (inputString.equals(string) == true){
      System.out.println("Строка является палиндромом");
   } else{
       System.out.println("Строка не является палиндромом");
     }
   }
}