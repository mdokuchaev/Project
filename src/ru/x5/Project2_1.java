/*
Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
*/

package ru.x5;

import java.util.Scanner; 

public class Project2_1 { 
      
    public static void main(String[] args) { 
      
     Scanner in = new Scanner(System.in); 
    
     System.out.print("Введите целое число: "); 
     String s = in.nextLine(); 
     
     try {   
         System.out.println("Последняя цифра введенного числа: " + Math.abs(Integer.parseInt(s) % 10)); 
     }  
     catch (NumberFormatException e) { 
         System.out.println("Ошибка: " + s + " не является целым числом."); 
     } 
     in.close(); 
 } 
   
 } 
