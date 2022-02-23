/*
 Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo:
Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */
package patika_java101;

import java.util.Scanner;

public class RecPower {
    
    static void power(){
        
        Scanner scanner = new Scanner(System.in);
        
        int total=1;
        System.out.println("Taban değerini giriniz : ");
        int num = scanner.nextInt();
        
        System.out.println("Üs değerini giriniz : ");
        int exp = scanner.nextInt();
               
        for(int i=1; i<=exp; i++){
            total *= num;
        }
       
        System.out.println("Result: " + total);

    }
    
    public static void main(String[] args) {   
        power();
    }
    
}
