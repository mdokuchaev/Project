/*
Ввести три целых числа с консоли.
Вывести на экран наименьшее из них.
*/

package ru.x5;

import java.util.Scanner;
import java.util.Arrays;

public class Project2_5 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
  
    System.out.print("Введите три целых числа: ");
    String s = in.nextLine();
   
    try {
        int[] massInt = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        if (massInt.length == 3) {
          Arrays.sort(massInt);
          System.out.println("Наименьшее из введенных чисел: " + massInt[0]);
        } else {
            System.out.println("Ошибка: необходимо ввести 3 целых числа!"); 
        }
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка ввода: необходимо ввести 3 целых числа!");    
    }
    in.close();
}
 
}
