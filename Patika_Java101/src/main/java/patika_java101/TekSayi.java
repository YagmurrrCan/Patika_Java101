package patika_java101;


import java.util.Scanner;

/*
 Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden 
ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

/**
 *
 * @author Lenovo
 */
public class TekSayi {
    
     public static void main(String[] args) {   
        
       int number, i, total=0;
      
       Scanner input = new Scanner(System.in);
       
        do{
            System.out.println("Please give a number: ");
            number = input.nextInt();
            if(number%2==0 && number%4==0){
                total += number;
                System.out.println("Toplam :" + total);
            }
        } while(number%2==0);
        
        System.out.println("Toplam :" + total);
    }
    
}
