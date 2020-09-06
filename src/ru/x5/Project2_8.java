package ru.x5;

import java.util.Arrays;

public class Project2_8 {
    
   public static void main(String[] args) {
       
       int[] mass = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2}; 
       System.out.println("Массив целых чисел: " +  Arrays.toString(mass));
       int max = mass[0];
       int sum1 = 0, sum2 = 0, sum3 = 0;
       int count1 = 0, count2 = 0;
       double average = 0;
       
       for (int i=0; i < mass.length; i++) {
         if (mass[i] > max) {
             max = mass[i]; // максимальное значение
         }
         if (mass[i] >= 0) {
             sum1 += mass[i]; // сумма положительных элементов
             count1++; //количество положительных элементов
         }
         if (mass[i] < 0) {
             if (mass[i] % 2 == 0) {
                 sum2 += mass[i]; // сумма четных отрицательных элементов
             }
            sum3 += mass[i]; // сумма отрицательных элементов
            count2 ++; // количество отрицательных элементов
         }
       }
       
       if (count2 > 0) {
          average = sum3 * 1.0 / count2;
       }
       
       System.out.println("Максимальное значение в массиве: " +  max);
       System.out.println("Сумма положительных элементов в массиве: " + sum1);
       System.out.println("Cумма четных отрицательных элементов в массиве: " + sum2);
       System.out.println("Количество положительных элементов в массиве: " + count1);
       System.out.println("Среднее арифметическое отрицательных элементов в массиве: " + average);

   }
 
}

