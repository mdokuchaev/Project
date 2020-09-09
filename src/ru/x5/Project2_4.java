/*
Ввести целое число в консоли. 

Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2; 
если нулевым,то заменить его на 10.

Вывести полученное число.
*/
package ru.x5;

import java.util.Scanner;

public class Project2_4 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    String s = in.nextLine();
    
    try {
        int i = Integer.parseInt(s);
        if (i > 0) {
            i++;
        }  
        else if (i < 0) {
            i-=2;
        }
        else {
            i=10;
        }
        
        System.out.println("Введенное число: " + i);
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");    
    }
    in.close();
}
 
}
