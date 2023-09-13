import java.util.Scanner;

public class harmonik_seri_hesaplama {
    public static void main(String[] args) {
        //java ile girilen harmonik serisini bulan programı yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        double toplam=0;
        for(double i=1;i<=sayi;i++){
            toplam = toplam + (1.0/ i);

            System.out.println(toplam);
        }

    }
}
