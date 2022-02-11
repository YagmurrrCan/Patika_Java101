/*
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
package patika_java101;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class SayiSirala {
    
    public static void main(String[] args) {
    
        // Değişkenler
        double sayi1,sayi2,sayi3;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alma
        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();
        
        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextDouble();
        
        if(sayi1>sayi2 && sayi1>sayi3){
            if(sayi2>sayi3){
                System.out.println("sayi1 > sayi2 > sayi3");
            } else {
                System.out.println("sayi1 > sayi3 > sayi2");
            }
        } else if(sayi2>sayi1 && sayi2>sayi3){
            if(sayi1>sayi3){
                System.out.println("sayi2 > sayi1 > sayi3");
            } else {
                System.out.println("sayi2 > sayi3 > sayi1");
            }
        } else {
            if(sayi1>sayi2){
                System.out.println("sayi3 > sayi1 > sayi2");
            } else {
                System.out.println("sayi3 > sayi2 > sayi1");
            } 
        }
    
    }
}
