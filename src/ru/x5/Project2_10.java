/*

Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль.

*/

package ru.x5;

import java.util.Arrays;

public class Project2_10 {
    
   public static void main(String[] args) {
       
       int[] massInt = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
       System.out.println("Массив целых чисел: " +  Arrays.toString(massInt));
   
       int countPositiveElement = 0;
 
       for (int i = 0; i < massInt.length; i++) {
           if (massInt[i] != 0) {
               if (countPositiveElement != i) {
                   massInt[countPositiveElement] = massInt[i];
                   massInt[i] = 0;
               }
               countPositiveElement++;
           } 
       }
       System.out.println("Массив целых чисел - нули в конце масива: " +  Arrays.toString(massInt));
   }
 
}
