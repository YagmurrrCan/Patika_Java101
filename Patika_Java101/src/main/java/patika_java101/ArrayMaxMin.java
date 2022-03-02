/*
 Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı 
ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */
package patika_java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
     public static void main (String[] args) {
        Scanner input = new Scanner(System.in);        
        int min=0, max=0;
        
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(numbers);
        
        
        System.out.println("Please give a number : ");
        int num = input.nextInt();
        
        min=num;
        max=num;
  
         for (int i = 0; i<numbers.length; i++) {
            if (num < numbers[i]){
              min = numbers[i-1];
              max = numbers[i];
              break;
            }
        }
                
       System.out.println("Büyük sayı: "+ max+" "+" En küçük sayı: "+min);
    }    
}
