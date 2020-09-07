/*
Ввести три целых числа с консоли.
Вывести на экран наименьшее из них.
*/



import java.util.Scanner;
import java.util.Arrays;

public class Project2_5 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
  
    System.out.print("Введите три целых числа: ");
    String s = in.nextLine();
   
    try {
        int[] mass = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        if (mass.length == 3) {
          Arrays.sort(mass);
          System.out.println("Наименьшее из введенных чисел: " + mass[0]);
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
