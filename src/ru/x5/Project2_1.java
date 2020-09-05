package ru.x5;

import java.util.Scanner;

public class Project2_1 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    long i = 0;

    System.out.print("Введите целое число: ");
    String s = in.nextLine();
    
    try {
        
        i = Integer.parseInt(s);
        System.out.println("Последняя цифра введенного числа: " + Math.abs(i % 10));
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");
        
    }
    in.close();
}
 
}
