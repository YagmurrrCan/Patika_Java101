/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. 
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). 
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. 
Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

Senaryo
Matris : 
2    3    4    
5    6    4    
Transpoze : 
2    5    
3    6    
4    4    


Matris : 
1    2    3    
4    5    6    
Transpoze : 
1    4    
2    5    
3    6   
 */
package patika_java101;

import java.util.Arrays;
import java.util.Scanner;

public class MatrisT {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Satır sayısı: ");
    int row = input.nextInt();
    System.out.println("Sütun sayısı: ");
    int column = input.nextInt();
    
    int[][] mtrx = new int[row][column];
    int[][]transpose=new int[column][row];
    
    for (int i=0; i<row; i++) {
        for (int j=0; j<column; j++) {
            System.out.println("Matris elemanlarını giriniz [" + i + "]" + " [" + j + " ]: ");
            mtrx[i][j]=input.nextInt();
        }
    }   
    System.out.println("Matrisiniz:\n" + Arrays.deepToString(mtrx)); //deepToString multi array için uygundur.

    for (int i=0; i<row; i++) {
        for (int j=0; j<column; j++)
            transpose[j][i] = mtrx[i][j];
    }
    System.out.println("Transpozu: \n"+ Arrays.deepToString(transpose));
    }   
}
