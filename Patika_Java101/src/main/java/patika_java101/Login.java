/*
 * Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, 
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
package patika_java101;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Login {
    
    public static void main(String[] args) {
        
        String username, password;
        int secim;
    
     //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan değer alma
        System.out.println("Kullanıcı adınız? : ");
        username = input.nextLine();
        
        System.out.println("Şifreniz? : ");
        password = input.nextLine();
        
        if(username.equals("patika") && password.equals("1234")){
             System.out.println("Giriş başarılı");
        } else{
             System.out.println("Hatalı giriş");
             System.out.println("Şifrenizi sıfırlamak ister misiniz?");
             System.out.println("Evet ise 1'e basınız.\n Hayır ise 2'ye basınız.");
             
             System.out.println("Seciminiz: ");
             secim = input.nextInt();

             switch(secim){
                 case 1:
                    System.out.println("Lütfen yeni şifre oluşturun.");
                    System.out.println("Yeni şifreniz : ");
                    
                    Scanner inp = new Scanner(System.in);
                    password = inp.nextLine();

                    if (password.equals("1234")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        
                    } else {
                        System.out.println("Şifre oluşturuldu! ");
                    }
                    break;
                 case 2: 
                    System.out.println("Tekrar giriş yapmayı deneyin");
                    break;
             }
        }
    }
        
}

