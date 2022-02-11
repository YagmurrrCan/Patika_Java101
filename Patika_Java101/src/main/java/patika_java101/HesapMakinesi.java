package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HesapMakinesi {
    
    public static void main(String[] args) {
    
        // Değişkenler
        double n1,n2, sonuc;
        int secim;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alma
        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();
        
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();
        
        System.out.println("________Menü__________\n");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölmen");
        System.out.println("________Menü__________");
        
        System.out.println("Seciminiz: ");
        secim = input.nextInt();
        
        System.out.println(secim);
        
        switch(secim) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;  
            case 4: 
                System.out.println("Bölüm: " + (n1 / n2));
                break;
            default:
                 System.out.println("Yanlış bir seçim yaptınız.Tekrar deneyiniz.");
                break;
        }
    }
}