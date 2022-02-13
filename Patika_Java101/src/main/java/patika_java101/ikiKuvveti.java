/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika_java101;

import java.util.Scanner;

/**
 Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class ikiKuvveti {
  
    public static void main(String args[]) {
    
        int num,i,j;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number : ");
        num = input.nextInt();
 /* 2nin kuvvetleri       
        for(i=1; i<=num; i*=2){
            System.out.println(i);
        }
*/
 //4 ve 5in katları yani 20nin katları:
        for (i=1, j=1; i<=num || j<=num; i*=4, j*=5){
            if(i!=1 && j!=1){
                System.out.println("Powers of 4 : "+i);
                if(j<num)
                    System.out.println("Powers of 5 : "+j);
            }
        }
        
    }
}

