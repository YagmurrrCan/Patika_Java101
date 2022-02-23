package patika_java101;

import java.util.Scanner;

public class PalindromSayi {
    
     static boolean isPalindrom(int num) {
        int temp = num;
        int reverseNumber=0;
        int lastNumber;
        
        while(temp != 0) {   //basamaklar bittiğinde çalışmaması için
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10) +lastNumber; 
    //Bsp: 247-> temp:247, reverseNumber:0// 0*10+7=7 başa alıcaz
      // 7*10+4=74
      // 74*10 +2=742 terse döndü palindrom mu? 
            temp /= 10;  //247/10=24 kalıyor                                                    
        }
        if (num == reverseNumber){
            System.out.println(num +" Palindrom.");
            return true;
        }else{
            System.out.println(num +" not Palindrom.");
            return false;
        }
        
    }
     
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number : ");
        int number = scanner.nextInt();
        isPalindrom(number);
     
    }
    
}
