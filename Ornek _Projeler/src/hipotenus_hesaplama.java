import java.util.Scanner;

public class hipotenus_hesaplama {
    public static void main(String[] args) {
        System.out.println("-----------------");
        // dik kenarları verilen üçgenin hipotenüsünü hesapla

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kenarın değerini giriniz:");
        int kenar1 = scan.nextInt();

        System.out.println("İkinci kenarın değerini giriniz:");
        int kenar2 = scan.nextInt();

        int kenar3Karesi = ((kenar1*kenar1) + (kenar2*kenar2));

        int hipotenus = (int) Math.sqrt(kenar3Karesi);

        System.out.println("Hipotenüs değeri = " + hipotenus);

        //bonus soru üçgenin alanını hesaplama

        int alan = ((kenar1*kenar2)/2);
        System.out.println("üçgenin alanı = " + alan);


    }
}
