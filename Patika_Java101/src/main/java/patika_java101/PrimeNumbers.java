/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */
package patika_java101;

import java.util.Scanner;

public class PrimeNumbers {
     public static void main(String[] args) {   
       /*       
        for(int i = 2; i<=100; i++){
            boolean isPrime=true;
            for (int j = 2; j<=i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }  */  
        int count=0;
       
        for(int num=2; num<=100; num++) {
            int bölen=0;
            for (int i=2; i<num; i++){
                if(num%i == 0){ 
                   bölen=1;
                   break;
                }
            }
            if(bölen==0) {
                System.out.print(num+" ");
                count++;
            }
        }
       
     
    }
}
