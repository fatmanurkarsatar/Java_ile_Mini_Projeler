import java.util.Scanner;

public class sms_mesajboyutu_hesaplama {
    public static void main(String[] args) {
        //kullanıcının girdiği metnin mesaj boyutunu hesaplayan program
        //her bir mesaj karakter sınırı 160 kelimedir

        Scanner scan = new Scanner(System.in);
        System.out.println("mesaj giriniz:");
        String msg = scan.nextLine();

        int smsLength = (int) Math.ceil(msg.length()/160.0);
        System.out.println("mesajınız = " + msg.length() + " karakterden oluşuyor " + (int)smsLength + " sms'e bölünebilir");



    }
}
