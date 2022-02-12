/*
 Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
Mesafe başına ücret 0,10 TL / km olarak alın. 
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL // km * perKm
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL  // agedic = total*ageOrani
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL    // indirimli = total - agedisc
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL  // indirimli * 0.2
Toplam Tutar = (135-27)* 2 = 216 TL
 */

package patika_java101;

import java.util.Scanner;

public class UcakBileti{
    public static void main(String[] args) {
        
        int km,yas,type; 
        double perKm = 0.10;
        double total = 0, indirim, indirimOran=0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gideceğiniz mesafeyi yazınız(km): ");
        km = scanner.nextInt();
        
        System.out.println("Yaşınızı yazınız: ");
        yas = scanner.nextInt();
        
        System.out.println("Tek yön için 1; çift yön için 2'yi seçiniz: ");
        type = scanner.nextInt();

        if(km>0 && yas>0)  {

            total = km * perKm;
          
            if(yas<12){
                if (type==2) {
                    double ageDiscount = (total-(total * (0.50)));
                    double directionDiscount = ((ageDiscount-(ageDiscount*0.20))*2);
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (total-(total * (0.50)));
                    System.out.println(ageDiscount);
                }
            }

            else if (yas>=12 && yas<=24) {
                if (type==2) {
                    double ageDiscount = (total - (total * (0.10))); // total- (total*indirimOrani)
                    double directionDiscount = ((ageDiscount-(ageDiscount*0.20))*2);
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (total-(total * (0.50)));
                    System.out.println(ageDiscount);
                }

            }

            else if (yas>=65){
                if (type==2) {
                    double ageDiscount = (total-(total * (0.30)));
                    double directionDiscount = ((ageDiscount-(ageDiscount*0.20))*2);
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (total-(total * (0.50)));
                    System.out.println(ageDiscount);
                }

            }else{
                System.out.println("Toplam Tutar : " +total);      
            }      
        }

        else{
            System.out.println("Geçersiz sayı girdiniz");
        }
    }
}