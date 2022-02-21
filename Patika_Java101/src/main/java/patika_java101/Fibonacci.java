/*
 Java döngüler ile fibonacci serisi bulan program yazıyoruz. 
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, 
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 */
package patika_java101;

import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {   
        
       int num, n1=0, n2=1, n3;
      
       Scanner input = new Scanner(System.in);
       System.out.println("Fibonacci sayısını giriniz: ");
       num = input.nextInt();
       
        System.out.print(n1+" "+n2);//0 ve 1 yazdır

        for(int i=2; i<num; i++)//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            n3= n1+n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        }
    }