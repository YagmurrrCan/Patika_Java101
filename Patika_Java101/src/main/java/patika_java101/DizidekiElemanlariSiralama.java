/*
 ava dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221 
 */
package patika_java101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    System.out.println("Dizinin boyutunu giriniz :");
    int boyut = input.nextInt();
    System.out.println("Dizinin boyutu n :" + boyut);
        
    System.out.println("Dizinin elemanlarını giriniz : ");
    int[] list = new int[boyut];
    int startNumber=1;
    
        for (int i=0; i<list.length; i++) {
            int value = input.nextInt();
            list[i] = value;
            System.out.println(startNumber++ + ". Elemanı: " + value);
        }
        
        Arrays.sort(list);
        System.out.println("\nSıralama: " + Arrays.toString(list));
    }
}
