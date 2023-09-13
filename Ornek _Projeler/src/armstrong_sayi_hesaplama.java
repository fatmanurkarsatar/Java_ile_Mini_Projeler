import java.util.Scanner;

public class armstrong_sayi_hesaplama {
    public static void main(String[] args) {
        /*
        java ile girilen 4 haneli sayının arsmtrong sayısı
        olup olmadığını bulan program

        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının
        n'inci üstlerinin toplamı,
        sayının kendisine eşitse, böyle sayılara
        Armstrong sayı denir.
        Örneğin 407 sayısını ele alalım.
        (4^3)+ (0^3)+(7^3) = 64+0+343 = 407
        sonucunu verir. Bu da 407 sayısının
        armstrong bir sayı olduğunu gösterir.
         */

        int birler, onlar, yuzler, binler;
        int bir_ussu, on_ussu, yuz_ussu, bin_ussu;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dört haneli bir sayı giriniz:");
        int sayi = scan.nextInt();
        int girilenSayi = sayi;
        System.out.println("girilen sayı = " + sayi);

        System.out.println("");
        binler = sayi / 1000;
        sayi = sayi - (1000 * binler);

        yuzler = sayi / 100;
        sayi = sayi - (100 * yuzler);

        onlar = sayi / 10;
        sayi = sayi - (10 * onlar);

        birler = sayi / 1;
        sayi = sayi - (1 * birler);

        System.out.println("binler basamağı = " + binler);
        System.out.println("yuzler basamağı = " + yuzler);
        System.out.println("onlar basamağı = " + onlar);
        System.out.println("birler basamağı = " + birler);

        System.out.println("");
        bin_ussu = (int) Math.pow(binler, 4);
        System.out.println("binliğin üssü = " + bin_ussu);

        yuz_ussu = (int) Math.pow(yuzler, 4);
        System.out.println("yüzlüğün üssü = " + yuz_ussu);

        on_ussu = (int) Math.pow(onlar, 4);
        System.out.println("onluğun üssü = " + on_ussu);

        bir_ussu = (int) Math.pow(birler, 4);
        System.out.println("birliğin üssü = " + bir_ussu);

        System.out.println("");
        int Us_toplam = bin_ussu + yuz_ussu + on_ussu + bir_ussu;
        System.out.println("Üslerin toplamı = " + Us_toplam);

        if (Us_toplam == girilenSayi) {
            System.out.println("girilen sayı = " + girilenSayi + " üslerin toplamı = " + Us_toplam + " eşit olduğu için armstrong sayıdır");
        } else {
            System.out.println("girilen sayı = " + girilenSayi + " üslerin toplamı = " + Us_toplam + " eşit olmadığı için armstrong sayı değildir");
        }

    }
}

