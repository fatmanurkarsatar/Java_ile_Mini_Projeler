import java.util.Scanner;

public class manav_sepet_tutari_hesaplama {
    public static void main(String[] args) {
        //kullanıcıların manavdan almış oldukları ürünlerin kg
        //değerlerine göre toplam tutarını ekrana yazdıran program

        // salatalık 3.14 tl
        // elma 4.11 tl
        // kabak 2.22 tl
        // domates 0.95 tl
        // patlıcan 7 tl

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç kilogram salatalık almak istiyorsunuz:");
        double salatalikKilo = scan.nextDouble();

        System.out.println("kaç kilogram elma almak istiyorsunuz:");
        double ElmaKilo = scan.nextDouble();

        System.out.println("kaç kilogram kabak almak istiyorsunuz:");
        double kabakKilo = scan.nextDouble();

        System.out.println("kaç kilogram domates almak istiyorsunuz:");
        double domatesKilo = scan.nextDouble();

        System.out.println("kaç kilogram patlıcan almak istiyorsunuz:");
        double patlicanKilo = scan.nextDouble();

        double salatalikFiyat = salatalikKilo * 3.14;
        double elmaFiyat = ElmaKilo * 4.11;
        double kabakFiyat = kabakKilo * 2.22;
        double domatesFiyat = domatesKilo * 0.95;
        double patlicanFiyat = patlicanKilo * 7;

        double marketTutari = salatalikFiyat + elmaFiyat + kabakFiyat+ domatesFiyat+ patlicanFiyat;

        System.out.println("market tutarı = " + marketTutari);


    }
}
