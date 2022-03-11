/*
 Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
package patika_java101;
import java.util.*;

public class ElemanFrekansi {
    static boolean isCheck(int[] arr, int value, int indis){
     if (indis<0){ 
        return false;
     }
        for(int i=0; i<=indis; i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
    
    static int frekans(int[] arr, int value, int indis){
        if (indis>=0){
            if (arr[indis] == value){
                return 1+frekans(arr , value, indis-1);
            }else{
                return 0+frekans(arr , value, indis-1);
            }
        }
        return  0;
    }
    
    public static void main(String[] args){
        int count=0;
         
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Tekrar Sayıları : ");
        System.out.println(Arrays.toString(list));
        
        for(int i=0; i<list.length; i++) { 
            if (!isCheck(list, list[i], i-1)){
                System.out.printf("%d sayısı %d kere tekrar edildi.\n", list[i],frekans(list,list[i],list.length-1));
            }
        }
    }
    
}
