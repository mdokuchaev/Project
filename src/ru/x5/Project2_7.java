/*

Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города. 

( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00 руб. ).

Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»

*/

package ru.x5;

import java.util.Scanner;

public class Project2_7 {
    
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Код города - Москва (905), Ростов(194), Краснодар(491), Киров(800).");
    System.out.print("Введите код города для расчета стоимости разговора: ");
   
    String s = in.nextLine();
    
    try {
        int minute =  10;
        switch (Integer.parseInt(s)) {
          case 905:
              System.out.println("Москва. Стоимость разговора: " + 4.15 * minute + " руб.");
              break;
          case 194:
              System.out.println("Ростов. Стоимость разговора: " + 1.98 * minute + " руб.");
              break;
          case 491:
              System.out.println("Краснодар. Стоимость разговора: " + 2.69 * minute + " руб.");
              break;
          case 800:
              System.out.println("Киров. Стоимость разговора: " + 5.00 * minute + " руб.");
              break;
          default:
              System.out.println("Код города не найден.");
        }       
    } 
    catch (NumberFormatException e) {
        System.out.println("Ошибка: код города введен некорректно."); 
    }
    in.close();
}
 
}
