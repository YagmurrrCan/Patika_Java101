package patika_java101;
import java.util.Scanner;

public class TersStar {
    
     public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int basamak = input.nextInt();
        
        for (int i= basamak; i>=0; i--) {
            for(int j= basamak; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*(i-1))+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    
}
