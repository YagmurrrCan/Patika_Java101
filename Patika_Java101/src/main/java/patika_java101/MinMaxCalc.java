//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
//
//Senaryo
//Kaç tane sayı gireceksiniz: 4
//1. Sayıyı giriniz: 16
//2. Sayıyı giriniz: -22
//3. Sayıyı giriniz: -15
//4. Sayıyı giriniz: 100
//En büyük sayı: 100
//En küçük sayı: -22

package patika_java101;

import java.util.Scanner;

public class MinMaxCalc {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);        
        
        int adet, num; 
        int min=0, max=0;
       
        System.out.println("Kaç tane sayı gireceksiniz? : ");
        adet = input.nextInt();
        
        for(int i=1; i<=adet; i++) {
            System.out.println(i+ ". Sayıyı giriniz: ");
            num = input.nextInt();
            
             if (i == 1) {
                min= num;
                max= num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
                
       System.out.println("En büyük sayı: "+ max+" "+" En küçük sayı: "+min);
    }
    
}
