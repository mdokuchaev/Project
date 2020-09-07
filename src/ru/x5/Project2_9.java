/*
Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].

Переставить элементы массива в обратном порядке.
Вывести результат в консоль
*/

package ru.x5;

import java.util.Arrays;

public class Project2_9 {
    
   public static void main(String[] args) {
       
       int[] mass = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52}; 
       System.out.println("Массив целых чисел: " +  Arrays.toString(mass));
   
       int a = 0;
       
       for (int i = 0; i < mass.length / 2; i++) {
           
           a = mass [i];
           mass [i] = mass [mass.length - 1 - i];
           mass [mass.length - 1 - i] = a;
         
       }
       
       System.out.println("Массив целых чисел в обратном порядке: " +  Arrays.toString(mass));
     
   }
 
}

