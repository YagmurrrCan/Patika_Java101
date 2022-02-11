/*
  * Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DaireHesap {
    
    public static void main(String[] args) {
    
        int r;
        double pi = 3.14;
        double cevre,alan, alfa;
        
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan değer alma
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        
        cevre = 2*pi*r;
        System.out.println("Dairenin çevresi: " + cevre);
        
       /* alan = pi*r*r; 
        System.out.println("Dairenin alanı: "+ alan);
        */
         //Kullanıcıdan değer alma
        System.out.println("Merkezi açısını giriniz: ");
        alfa = input.nextInt();        
        
        alan = (pi * (r*r) * alfa) / 360;
        System.out.println("Dairenin alanı: "+ alan);
    }
    
}
