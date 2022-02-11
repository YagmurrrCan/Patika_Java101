package patika_java101;

import java.util.Scanner;

/**
 Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */
public class ManavKasa {
    
    public static void main(String[] args) {
        
        double armutfiyat=2.14;
        double elmafiyat=3.67;
        double domatesfiyat=1.11;
        double muzfiyat=0.95;
        double patlıcanfiyat=5;
            
        double armut,elma,domates,muz,patlıcan,toplam;
        
        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alma
        System.out.println("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();
        
        //Kullanıcıdan değer alma
        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();
        
        //Kullanıcıdan değer alma
        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();
        //Kullanıcıdan değer alma
        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();
        
        //Kullanıcıdan değer alma
        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlıcan = input.nextDouble();
        
        toplam = (armut*armutfiyat) + (elma*elmafiyat) + (domates*domatesfiyat) + (muz*muzfiyat)+ (patlıcan*patlıcanfiyat);
        System.out.println("Toplam Tutar : " + toplam);
    }
    
}
