import java.util.Scanner;

public class vucut_kitle_indeksi_hesaplama {
    public static void main(String[] args) {
        //kullanıcıdan kilo ve boyunu alıp vücut kitle indeksini hesaplayınız

        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuzu giriniz:");
        double kilo = scan.nextDouble();

        System.out.println("boyunuzu giriniz:");
        double boy = scan.nextDouble();

        double vki = (kilo/(boy*boy));

        System.out.println("vücut kitle indeksiniz = " + vki);

        if(vki<18.5){
            System.out.println("Zayıf");
        }else if(18.5<vki && vki<24.9){
            System.out.println("ideal");
        }else if(25<vki && vki<29.9){
            System.out.println("şişman");
        }else if(30<vki && vki<39){
            System.out.println("obez");
        }else{
            System.out.println("aşırı obez");
        }

    }
}
