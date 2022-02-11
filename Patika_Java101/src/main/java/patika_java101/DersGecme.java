/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DersGecme {
    
    public static void main(String[] args) {
    
        // Değişkenler
        double Mat, Fiz, Kim, Tur, Muz;
        double ortalama;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alma
        System.out.println("Matematik notunuz: ");
        Mat = input.nextDouble();
        
        System.out.println("Fizik notunuz: ");
        Fiz = input.nextDouble();
        
        System.out.println("Kimya notunuz: ");
        Kim = input.nextDouble();
        
        System.out.println("Türkçe notunuz: ");
        Tur = input.nextDouble();
        
        System.out.println("Müzik notunuz: ");
        Muz = input.nextDouble();
        
        ortalama = (Mat+ Muz + Tur + Fiz + Kim)/5;
        System.out.println("Ortalamanız: " + ortalama);
        
        if(ortalama<55){
           System.out.println("Ortalamadan kaldınız!");
        } else{
            System.out.println("Sınıfı geçtiniz!");
        }
        
    }
    
}
