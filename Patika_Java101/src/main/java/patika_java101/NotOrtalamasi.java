package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Yagmur Can
 */
public class NotOrtalamasi {
    
    public static void main(String[] args) {
    
        // Değişkenler
        double Mat, Fiz, Kim, Tur, Tar, Muz;

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
        
        System.out.println("Tarih notunuz: ");
        Tar = input.nextDouble();
        
        System.out.println("Müzik notunuz: ");
        Muz = input.nextDouble();
    
        
        double toplam = (Mat + Fiz + Kim + Tur + Tar + Muz);
        double sonuc = toplam/6.0;
        
        System.out.println("Not Ortalamanız: " + sonuc);
        
        System.out.println((sonuc>=60)? "Gecti" : "Kaldi");
    }
}