/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika_java101;

import java.util.Scanner;

public class ExpNumber {
    
     public static void main(String args[]) {
               
        int total=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num = input.nextInt();
        
        System.out.println("Please give a exponential number: ");
        int exp = input.nextInt();
        
        for(int i=1; i<=exp; i++){
            total *= num;
        }
        System.out.println("Result: " + total);
       
    }
    
}
