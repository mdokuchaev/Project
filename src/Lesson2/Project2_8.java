/*

Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. 

Для данного массива найти и вывести на экран:

- максимальное значение
- сумму положительных элементов
- сумму четных отрицательных элементов
- количество положительных элементов
- среднее арифметическое отрицательных элементов

*/

package ru.x5;

import java.util.Arrays;

public class Project2_8 {
    
   public static void main(String[] args) {
       
       int[] massInt = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2}; 
       System.out.println("Массив целых чисел: " +  Arrays.toString(massInt));
       int maxEelement = massInt[0];
       int sumPositiveElements = 0, sumEvenNegativEelements = 0, sumNegativEelements = 0;
       int countPositiveElements = 0, countNegativElements = 0;
       double averageNegativElements = 0;
         
       for (int i = 0; i < massInt.length; i++) {
         if (massInt[i] > maxEelement) {
             maxEelement = massInt[i]; // максимальное значение
         }
         if (massInt[i] >= 0) {
             sumPositiveElements += massInt[i]; // сумма положительных элементов
             countPositiveElements++; //количество положительных элементов
         }
         if (massInt[i] < 0) {
             if (massInt[i] % 2 == 0) {
                 sumEvenNegativEelements += massInt[i]; // сумма четных отрицательных элементов
             }
            sumNegativEelements += massInt[i]; // сумма отрицательных элементов
            countNegativElements ++; // количество отрицательных элементов
         }
       }
       
       if (countNegativElements > 0) {
          averageNegativElements = sumNegativEelements * 1.0 / countNegativElements;
       }
       
       System.out.println("Максимальное значение в массиве: " +  maxEelement);
       System.out.println("Сумма положительных элементов в массиве: " + sumPositiveElements);
       System.out.println("Cумма четных отрицательных элементов в массиве: " + sumEvenNegativEelements);
       System.out.println("Количество положительных элементов в массиве: " + countPositiveElements);
       System.out.println("Среднее арифметическое отрицательных элементов в массиве: " + averageNegativElements);
   }

}
