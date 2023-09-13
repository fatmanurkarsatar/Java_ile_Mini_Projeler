import java.util.Scanner;

public class Not_ortalamasi_hesaplama {
    public static void main(String[] args) {
        //kullanıcıdan ders notlarını alıp ortalamasını hesaplatma

        Scanner scan = new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz:");
        int matematik = scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        int turkce = scan.nextInt();

        System.out.println("Fen bilimleri notunuzu giriniz:");
        int fen = scan.nextInt();

        System.out.println("Sosyal bilgiler notunuzu giriniz:");
        int sosyal = scan.nextInt();

        System.out.println("müzik notunuzu giriniz:");
        int muzik = scan.nextInt();

        double ort = (matematik + turkce + sosyal + muzik) / 6;

        System.out.println("ortalamanız: " + ort);



    }
}
