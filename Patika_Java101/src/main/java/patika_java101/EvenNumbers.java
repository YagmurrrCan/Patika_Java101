/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika_java101;

import java.util.Scanner;

/**
 Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class EvenNumbers {
    
     public static void main(String[] args) {   
        
       int number, i, total=0, counter=0;
       double average;
               
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please give a number: ");
       number = input.nextInt();
       
      /*EVEN NUMBERS
        for(i=0; i<=number; i++){
           if(i%2==0){
               System.out.println(i);
           }
        }
        */
        for(i=0; i<number; i++){
            if(i%3==0 && i%4==0){
                total = total + i;
                counter++;
            }
        }
         average = total / counter;
            System.out.println("Average of Numbers Divided by 3 and 4: " + average);
    }
}