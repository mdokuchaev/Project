/*

Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его.
Вывести полученное число.

*/

package ru.x5;

import java.util.Scanner;

public class Project2_3 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    String s = in.nextLine();
   
    try {
        int number = Integer.parseInt(s);
        if (number >= 0) {
            number++;
        }  
        System.out.println("Введенное число: " + number);
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");    
    }
    in.close();
}

}
