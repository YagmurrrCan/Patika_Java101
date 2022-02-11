package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Yagmur Can
 * 
 * Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
*   tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class KdvTutari {
    public static void main(String args[]) {
        
        //kdv tutari= %18
       double fiyat;
       double kdvTutari;
       double kdvliTutar;
       
        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan değer alma
        System.out.println("Ücret tutarını giriniz: ");
        fiyat = input.nextDouble();
        
         if(fiyat>=0 && fiyat<=1000){
             
            double kdvOrani = 0.18;
            kdvTutari = fiyat * kdvOrani;

            System.out.println("KDV Hariç Fiyat: " + fiyat);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV Tutarı: " + kdvTutari);

            kdvliTutar = (fiyat + kdvTutari);
            System.out.println("KDV Dahil Fiyat: " + kdvliTutar);     
            
        } else{
            
            double kdvOrani = 0.08;
            kdvTutari = fiyat * kdvOrani;

            System.out.println("KDV Hariç Fiyat: " + fiyat);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV Tutarı: " + kdvTutari);

            kdvliTutar = (fiyat + kdvTutari);
            System.out.println("KDV Dahil Fiyat: " + kdvliTutar);     
        }
    }
    
}
