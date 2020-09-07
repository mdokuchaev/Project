/*
Ввести целое число в консоли. 

Вывести его строку-описание вида «отрицательное четное число»,
«нулевое число», «положительное нечетное число» и
т. д.

*/

package ru.x5;

import java.util.Scanner;

public class Project2_6 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int i = 0;

    System.out.print("Введите целое число: ");
    String s = in.nextLine();
    
    try {
        i = Integer.parseInt(s);
        
        if (i == 0) {
            s = "нулевое ";
        }  
        else {
            if (i < 0) {
              s = "отрицательное ";
            }
            else {
              s = "положительное ";
            }
            if (i % 2 == 0) {
              s = s + "четное ";
            }
            else {
              s = s + "нечетное ";
            }
        }
    
        System.out.println("Введено " + s + "число");
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: " + s + " не является целым числом.");    
    }
    in.close();
}
 
}