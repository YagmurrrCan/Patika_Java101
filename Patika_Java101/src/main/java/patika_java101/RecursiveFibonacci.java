package patika_java101;

// f(n) = f(n-1) + f(n-2)

import java.util.Scanner;
import static patika_java101.PalindromSayi.isPalindrom;

public class RecursiveFibonacci {
    
    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number : ");
        int number = scanner.nextInt();
        System.out.println(fib(number));
   
    }
    
}
