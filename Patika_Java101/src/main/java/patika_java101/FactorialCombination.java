package patika_java101;

import java.util.Scanner;

public class FactorialCombination {
    
/*  FACTORIAL
    
    public static void main(String args[]) {
              
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number: ");
        
        int num = input.nextInt();
        
        int fac = 1;
        
        for(int i=1; i<=num; i++){
            fac = fac * i ;
        }
        System.out.println(num + " Factorial : " + fac);
       
    }
*/
    
    /*
Java ile faktöriyel hesaplayan program yazıyoruz.

Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)   // fac/(GroupFac * kFac)
 */
    
    //COMBINATION
      public static void main(String args[]) {
          int n,r;
          int comb;
          
          Scanner input = new Scanner(System.in);
          System.out.println("Please give a number: ");
          n = input.nextInt();
          
          System.out.println("Please give a group number: ");
          r = input.nextInt();
          
           
          int nfac=1;
          for(int i=1; i<=n; i++){
              nfac = nfac * i ;
          }
           
          int rfac=1;
          for(int i=1; i<=r; i++){
                rfac = rfac * i ;
          }
          
          int dif= 1;
          int k = n - r;
          for(int i=1; i<=k; i++){
                dif = dif * i ;
          }
      
          comb = nfac/ (rfac * dif);
          System.out.println("Combination : " + comb);
      }
}
