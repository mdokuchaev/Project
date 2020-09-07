/*

Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.

*/

package ru.x5;

import java.util.Scanner;

public class Project2_2 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int i = 0;

    System.out.print("Введите целое трехзначное число: ");
    String s = in.nextLine();
   
    try {
        i = Math.abs(Integer.parseInt(s));
        if ((i >= 100) && (i <= 999)) {
            i = i / 100 + i / 10 % 10 + i % 10;
            System.out.println("Сумма цифр этого трехзначного числа: " + i);
        }  
        else {
            System.out.println("Введенное число не является трехзначным");
        }
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");    
    }
    in.close();
}
 
}
