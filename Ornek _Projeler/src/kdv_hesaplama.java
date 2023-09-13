
import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {

        //kullanıcıdan alınan tutarın kdv'li fiyatını
        //kdv'siz fiyatını kdv tutarını hesaplayıp ekrana bastıran
        //program

        double kdv = 18;

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tutar giriniz:");
        double tutar = scan.nextDouble();

        Double kdvTutari = ((tutar*kdv) /100);
        System.out.println("kdv tutarı = " + kdvTutari);

        double kdvLiPrice = tutar+kdvTutari;
        System.out.println("kdv'li fiyat = " + kdvLiPrice);

        double realPrice = (tutar - kdvTutari);
        System.out.println("kdv'siz gerçek fiyatı = " + realPrice);


    }
}
