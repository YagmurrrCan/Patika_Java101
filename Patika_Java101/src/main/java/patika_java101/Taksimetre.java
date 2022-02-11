/*
 *Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
 */
package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Taksimetre {
    
    public static void main(String[] args) {
    double mesafe, ücret;
    double perKm = 2.20;
    double acilis = 10;
        
        Scanner input = new Scanner(System.in); 
    
        //Kullanıcıdan değer alma
        System.out.println("Mesafe giriniz: ");
        mesafe = input.nextDouble();
         
        ücret = acilis + (mesafe * perKm);
        
        ücret = (ücret<20) ? 20 : ücret;
        System.out.println("Ücretiniz: " + ücret);  
        /*
        if(ücret<20){
            ücret = 20;
            System.out.println("Ücretiniz: " + ücret);  
        } 
        else{
            System.out.println("Ücretiniz: " + ücret);  
        }
        */
    }
}