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
public class HarmonikSeri {
    
    public static void main(String args[]) {
              
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num = input.nextInt();
        
        double result = 0.0;
        for(double i=1; i<=num; i++){   
            result += (1.0/i) ;  //1 yazarsak int sonucu geliyor ya da double i=1 yazılabilir
        }
        System.out.println("Harmonic Result: " + result);
       
    }
}
