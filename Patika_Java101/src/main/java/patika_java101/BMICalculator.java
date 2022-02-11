/*
 Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */
package patika_java101;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        double kilo, boy, bmi;
        
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Lütfen kilonuzu giriniz: ");
       kilo = input.nextDouble();
               
       System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
       boy = input.nextDouble();
       
       bmi = kilo/(boy*boy);      
       System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    
    }
}
