/*
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak
 */
package patika_java101;
public class PalindromikKelime {
    static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    // ========================= Başka Yöntem =========================
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
        reverse += str.charAt(i);
        }
        
        //return str.equals(reverse); yeter aslında çünkü boolean değer döndürür.
        if(str.equals(reverse)){
            return true;
        } else {
            return false;
        }
    }
    //=================================================================
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
    }

    
}
