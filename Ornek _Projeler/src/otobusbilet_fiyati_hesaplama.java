import java.util.Scanner;

public class otobusbilet_fiyati_hesaplama {
    public static void main(String[] args) {
        //mesafeye ve durumlara göre otobüs bileti fiyatı hesaplama
        //kullanıcıdan mesafe(km), yaş ve yolculuk tipi(tek yön, gidiş-dönüş)
        //bilgileri ile mesafe başına ücret 0,10 tl olarak alın. İlk
        //olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki
        //koşullara göre müşteriye aşağıdaki indirimleri uygulayın

        /*
        - kullanıcıdan alınan değerleer geçerli(mesafe ve yaş değerleri
        pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. aksi takdirde
        kullanıcıya hatalı veri girdiniz şeklinde bir uyarı verilmelidir.

        - kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır

        - kişi 12-24 yaşları arasındaysa bilet fiyatı üzerinden %10 indirim uygulanır

        - kişi 65 yaşından büyükse bilet fiyatı üzerinden %30 indirim uygulanır

        - kişi yolculuk tipi gidiş dönüş seçtiyse bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("gideceğiniz km'yi girin:");
        double km = scan.nextDouble();

        System.out.println("yaşınızı giriniz:");
        int yas = scan.nextInt();

        System.out.println("yolculuk tipini seçiniz: (1=>tek yön , 2=>gidiş-dönüş)");
        int yolculukTuru = scan.nextInt();

    if(km>0 && yas>0 && (yolculukTuru == 1 || yolculukTuru == 2)) {
        double biletFiyati = (km * 0.10);
        double yasindirimliFiyat = 0;
        double yasindirimOrani = 0;

        if (yas < 12) {
            yasindirimOrani = 0.50;
        } else if (12 < yas && yas < 24) {
            yasindirimOrani = 0.10;
        } else if (yas > 65) {
            yasindirimOrani =  0.30;
        }

        biletFiyati = biletFiyati - (biletFiyati * yasindirimOrani);

        if(yolculukTuru == 2){
            biletFiyati = biletFiyati * 0.20;
            biletFiyati *=2;
        }

        System.out.println("toplam tutar = " + biletFiyati);

    } else {
        System.out.println("hatalı veri girdiniz:");
    }
}
}
