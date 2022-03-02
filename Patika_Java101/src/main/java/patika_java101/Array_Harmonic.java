/*
 Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

 */
package patika_java101;
public class Array_Harmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Average : " + sum / numbers.length);
        
        double result = 0.0;
        for(int i=0; i < numbers.length; i++){   
            result += (1.0/numbers[i]) ;  //1 yazarsak int sonucu geliyor ya da double i=1 yazılabilir
            System.out.println("Harmonic Result: " + result);
        }
    }    
}
