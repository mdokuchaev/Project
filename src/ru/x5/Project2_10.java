package ru.x5;

import java.util.Arrays;

public class Project2_10 {
    
   public static void main(String[] args) {
       
       int[] mass = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
       System.out.println("Массив целых чисел: " +  Arrays.toString(mass));
   
       int count = 0;
       int temp = mass.length;
       
       for (int i=0; i < mass.length; i++) {
           
           if (mass[i] != 0) {
               mass[count++] = mass[i];
              
               System.out.println("A " +  Arrays.toString(mass));
           } else {
               temp--;
           }
           
                              
           if (i >= temp) {
                mass[i] = 0;
                System.out.println("B " +  Arrays.toString(mass) + " i - " + i + " count - " + count+ " temp - " + temp);
           }
           
           
       }
       
       System.out.println("Массив целых чисел - нули в конце масива: " +  Arrays.toString(mass));
     
   }
 
}

