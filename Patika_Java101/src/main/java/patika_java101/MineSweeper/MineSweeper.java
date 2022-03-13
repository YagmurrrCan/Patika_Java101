/*
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
Kaybetme Senaryosu
Mayınların Konumu
* - - 
- - * 
- - - 
===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1
===========================
- 2 - 
- - - 
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0
===========================
- 2 - 
- - - 
0 - - 
Satır Giriniz : 0
Sütun Giriniz : 2
===========================
- 2 1 
- - - 
0 - - 
Satır Giriniz : 1
Sütun Giriniz : 0
===========================
- 2 1 
1 - - 
0 - - 
Satır Giriniz : 2
Sütun Giriniz : 1
===========================
- 2 1 
1 - - 
0 1 - 
Satır Giriniz : 2
Sütun Giriniz : 2
===========================
- 2 1 
1 - - 
0 1 1 
Satır Giriniz : 1
Sütun Giriniz : 2
Game Over!!
===========================


Kazanma Senaryosu
Mayınların Konumu
- - - 
- * - 
- * - 
===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 0
===========================
1 - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1
===========================
1 1 - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 2
===========================
1 1 1 
- - - 
- - - 
Satır Giriniz : 1
Sütun Giriniz : 0
===========================
1 1 1 
2 - - 
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0
===========================
1 1 1 
2 - - 
2 - - 
Satır Giriniz : 1
Sütun Giriniz : 2
===========================
1 1 1 
2 - 2 
2 - - 
Satır Giriniz : 2
Sütun Giriniz : 2
Oyunu Kazandınız !
1 1 1 
2 - 2 
2 - 2 
===========================
 */
package patika_java101.MineSweeper;
import java.util.*;

public class MineSweeper {
    int rowNumber,columnNumber;
    int[][] map = new int[rowNumber][columnNumber];
    int[][] game = new int[rowNumber][columnNumber];
    boolean basla = true;
    
    MineSweeper(int rowNumber, int column) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.game = new int[rowNumber][columnNumber];
    }
    
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    void run(){    
        int success =0;
        prepareGame();   
        printMap(map);
        
        System.out.println("============== MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ ===============");
            
        while(basla){
            printMap(game);
            System.out.println("Satır giriniz :");
            int row = input.nextInt();
            System.out.println("Sütun giriniz :");
            int column = input.nextInt();
            
            if(row < 0 || row >= rowNumber){
                System.out.println("Geçersiz koordinat!");
                continue;
            }
            if(column < 0 || column >= columnNumber){
                System.out.println("Geçersiz koordinat!");
                continue;
            }
            
            if(map[row][column] != -1){
                checkBomb(row, column);
                success++;
                if(success == ((rowNumber*columnNumber)-((rowNumber*columnNumber)/4))) {
                    System.out.println("Başardınız.");
                }
            } else {
                basla = false;
                System.out.println("Game Over!");
            }
        }
    }
    
    public void checkBomb(int r, int c){
        if(map[r][c] == 0){
            if((c < columnNumber-1) && (map[r][c+1] == -1)){
                game[r][c]++;
            } if(( c > 0) && (map[r][c-1] == -1)){
                game[r][c]++; 
            } if((r < rowNumber-1) && (map[r+1][c] == -1)){
                game[r][c]++; 
            } if((r > 0) && (map[r-1][c] == -1)){
                game[r][c]++; 
            }
            
            if(game[r][c] == 0){
                game[r][c] = -2;
            }
        }
    }
       /* Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. 
    Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. 
    Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.) */
    public void prepareGame() {
        System.out.println("============== MAYINLARIN KONUMU ==============");       
        int randRow, randCol, count=0;      
        while(count != (rowNumber*columnNumber)/4){
                randRow = rand.nextInt(rowNumber);
                randCol = rand.nextInt(columnNumber);
                if (map[randRow][randCol] != -1){
                    map[randRow][randCol] = -1;
                    count++;
                }
        }
    }
        
        public void printMap(int[][] arr) {
            
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j] >= 0)
                        System.out.print(" ");
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }       
        }  
}
