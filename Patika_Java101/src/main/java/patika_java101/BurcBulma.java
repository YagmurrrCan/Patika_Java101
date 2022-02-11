/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */
package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BurcBulma {
    
    public static void main(String[] args) {
    
        // Değişkenler
        int day,month;
        String burc="";

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alma
        System.out.println("Doğduğunuz gün: ");
        day = input.nextInt();
        
        System.out.println("Doğduğunuz ay: ");
        month = input.nextInt();
        
        if(month==1){
            if(day<=21){
                burc = "Oğlak";
            } else{
                burc = "Kova";
            }
        } else if(month==2){
            if(day<=19){
                burc = "Kova";
            } else{
                burc = "Balık";
            }
        } else if(month==3){
            if(day<=20){
                burc = "Balık";
            } else{
                burc = "Koç";
            }
        } else if(month==4){
            if(day<=20){
                burc = "Koç";
            } else{
                burc = "Boğa";
            }
        } else if(month==5){
            if(day<=21){
                burc = "Boğa";
            } else{
                burc = "İkizler";
            }
        } else if(month==6){
            if(day<=22){
                burc = "İkizler";
            } else{
                burc = "Yengeç";
            }
        } else if(month==7){
            if(day<=22){
                burc = "Yengeç";
            } else{
                burc = "Aslan";
            }
        } else if(month==8){
            if(day<=22){
                burc = "Aslan";
            } else{
                burc = "Başak";
            }
        } else if(month==9){
            if(day<=22){
                burc = "Başak";
            } else{
                burc = "Terazi";
            }
        } else if(month==10){
            if(day<=22){
                burc = "Terazi";
            } else{
                burc = "Akrep";
            }
        } else if(month==11){
            if(day<=21){
                burc = "Akrep";
            } else{
                burc = "Yay";
            }
        } else if(month==12){
            if(day<=21){
                burc = "Yay";
            } else{
                burc = "Oğlak";
            }
        } else{
            System.out.println("Hatalı giriş yaptınız.");
        }
        
        System.out.println("Burcunuz:" + burc);
    }
    
}
