/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika_java101;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Star {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int basamak = input.nextInt();
        
        for (int i = 0; i <= basamak ; i++) {
            for (int j = 0; j < (basamak-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        for (int i=(basamak-1); i>=0; i--) {
            for(int j=basamak; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*(i-1))+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    
}
