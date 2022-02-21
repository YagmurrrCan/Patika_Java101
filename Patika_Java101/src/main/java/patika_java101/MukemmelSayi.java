/*
 Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28  
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
 */
package patika_java101;
import java.util.Scanner;

public class MukemmelSayi {
    
    public static void main(String[] args) {
    
        int num, total=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen sayıyı giriniz: ");
        num = input.nextInt();

        for(int i=1; i<num; i++){
            if(num%i==0){  
            total += i;
           }
        }
            
        if(total == num){
            System.out.println(num+ " Mükemmel sayıdır.");
        } else{
            System.out.println(num+ " Mükemmel sayı değildir.");
        }
    }
}
