/*
 Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !
 */
package patika_java101;
import java.util.Scanner;

public class RecAsal {
    
    static boolean isPrime(int number, int bolen){
        if(number==2){
           return true;
        }
        else if(bolen<number){
            if(number%bolen==0)
            {
                return true;
            }
            else{
                isPrime(number,bolen+1);
                return false;
            }
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number : ");
        int number = input.nextInt();
               
        if (isPrime(number, 2)){
            System.out.print(number + " not prime");
        }
        else {
            System.out.print(number + " prime number");
        }
       
    }
    
}
