package patika_java101;

import java.util.Scanner;

/**
 Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */
public class EbobEkok {
    public static void main(String[] args) {   
        
       int n1,n2, bölen, ebob=1;
      
       Scanner input = new Scanner(System.in);
       System.out.println("Please give a first number: ");
       n1 = input.nextInt();
       
       System.out.println("Please give a second number: ");
       n2 = input.nextInt();     
     
       /*
       if(n1<=n2){
           for(int i=1; i<=n1;i++){
           if(n1%i==0 && n2%i==0){  
               ebob = i;
           }
       }
        System.out.println("EBOB: " + ebob);
        
       } else{
           for(int i=1; i<=n2;i++){
           if(n1%i==0 && n2%i==0){  
               ebob = i;
           }
       }
        System.out.println("EBOB: " + ebob);  
       }

   
       */  
       
       /*
       System.out.println("==BU DÖNGÜ DAHA AZ DÖNER DAHA BEST===");
       
       if(n1<=n2){
           for(int k=n1; k>=1; k--){
           if(n1%k==0 && n2%k==0){  
               ebob = k;
               System.out.println("EBOB: " + ebob);
               break;
           }
       }
        
       } else{
           for(int k=n2; k>=1; k--){
           if(n1%k==0 && n2%k==0){  
               ebob = k;
               System.out.println("EBOB: " + ebob);
               break;
           }
       } 
       }  

*/
        
       /*
       //EKOK İşlemi
       for(int i=1; i<=(n1*n2); i++){
           if(i%n1==0 && i%n2==0){
               System.out.println("EKOK: " + i);
               break;
           }
       }
       */
       
          if (n1<=n2) {
                int i=1;
                while (i<=n1) {
                    if (n1%i==0 && n2%i==0) {
                        ebob=i;
                    }
                    i++;
                }
                System.out.println("Ebob: "+ebob);
            } else {    // n1>n2
                int i=1;
                while (i<=n2) {
                    if (n1%i==0 && n2%i==0) {
                        ebob=i;
                    }
                    i++;
                }
                System.out.println("Ebob: "+ebob);
            }

            System.out.println("================");

            //EKOK İşlemi
            int i=1;
            while (i<=(n1*n2)) {
                if (i%n1==0 && i%n2==0) {
                    System.out.println("Ekok: "+i);
                    break;
                }
                i++;
            }

            System.out.println(n1*n2 / ebob);
    }
}
