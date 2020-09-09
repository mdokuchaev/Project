/*
Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].

Переставить элементы массива в обратном порядке.
Вывести результат в консоль
*/

package ru.x5;

import java.util.Arrays;

public class Project2_9 {
    
   public static void main(String[] args) {
       
       int[] massInt = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52}; 
       System.out.println("Массив целых чисел: " +  Arrays.toString(massInt));
   
       int tempInt = 0;
       
       for (int i = 0; i < massInt.length / 2; i++) {
           
           tempInt = massInt [i];
           massInt [i] = massInt [massInt.length - 1 - i];
           massInt [massInt.length - 1 - i] = tempInt;
         
       }
       System.out.println("Массив целых чисел в обратном порядке: " +  Arrays.toString(massInt));
   }
}
