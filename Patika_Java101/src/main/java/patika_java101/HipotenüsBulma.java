package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * 
 * Dik Üçgende Hipotenüs Bulan Program
    Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

    Ödev
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
public class HipotenüsBulma {
    
    public static void main(String[] args) {
    
    double a, b, c, u, cevre, alan;
    
    //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan değer alma
        System.out.println("Üçgenin kenar uzunluğunu giriniz: ");
        a = input.nextDouble();
        
        //Kullanıcıdan değer alma
        System.out.println("Üçgenin kenar uzunluğunu giriniz: ");
        b = input.nextDouble();
        
        //Kullanıcıdan değer alma
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Üçgenin hipotenüsü: " + c);
        
        cevre = a + b + c ;
        System.out.println("Üçgenin çevresi: "+ cevre);
        
        u = cevre/2;
        
        alan =  Math.sqrt(u * (u-a) * (u-b)* (u-c));
        System.out.println("Üçgenin alanı: "+ alan);
    
    }
}