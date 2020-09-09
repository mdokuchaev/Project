/*

Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль.

*/

//package ru.x5;

import java.util.Arrays;

public class Project2_10 {
    
   public static void main(String[] args) {
       
       int[] mass = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
       System.out.println("Массив целых чисел: " +  Arrays.toString(mass));
   
       int count = 0;
 
       for (int i = 0; i < mass.length; i++) {
           if (mass[i] != 0) {
               if (count != i) {
                   mass[count] = mass[i];
                   mass[i] = 0;
               }
               count++;
           } 
       }
       System.out.println("Массив целых чисел - нули в конце масива: " +  Arrays.toString(mass));
   }
 
}
