package patika_java101;

import java.util.Scanner;

public class ATMwithSwitchCase {
    
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3; //kalan hak
        int balance = 1500; //bakiye
        int select; //seçim
        int price;
                
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if(userName.equals("Yağmur Can") && password.equals("1234")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                
                do {
                    System.out.println("1-Para yatırma\n" +
                           "2-Para Çekme\n" +
                           "3-Bakiye Sorgula\n" +
                           "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatıracağınız para miktarını giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını giriniz : ");
                            price = input.nextInt();
                            if(price>balance){
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                                System.out.println("Kalan bakiyeniz" + balance);
                            }   break;
                        case 3:  
                            System.out.println("Bakiyeniz" + balance);
                            break;
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                 right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            
            }
        }
    
    }
}