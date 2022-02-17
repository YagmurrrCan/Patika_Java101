package patika_java101;

import java.util.Scanner;

public class Basamak_Toplami {
    public static void main(String[] args){
        int num, sonsayi, counter=0;//basamak sayısı 
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        num = input.nextInt();
        
        int tempnum = num;
        
        while(tempnum!=0){
            tempnum /= 10;
            counter++;
        }
        // System.out.print("Basamak sayısı"+ counter);
         
        tempnum = num;
        while(tempnum!=0){
            sonsayi = tempnum % 10;
            total += sonsayi;
            tempnum /=10;          
        }
        System.out.println("Basamaklar toplamı : " + total);
    }
    
}
