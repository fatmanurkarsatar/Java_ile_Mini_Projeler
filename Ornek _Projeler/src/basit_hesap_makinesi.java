import java.util.Scanner;

public class basit_hesap_makinesi {
    public static void main(String[] args) {

        //girilen iki sayı ile kullanıcının seçtiği
        //4 işlemi yaptırabilen bir hesap makinesi

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        System.out.println("bir sayı daha giriniz:");
        int sayi2 = scan.nextInt();

        int toplama = sayi+sayi2;
        int cikarma = sayi-sayi2;
        int carpma = sayi*sayi2;
        double bolme = sayi/sayi2;

        System.out.println("bir işlem seçiniz:");
        int select = scan.nextInt();

        if(select == 1){
            System.out.println("sonuç = " + toplama);
        }else if(select == 2){
            System.out.println("sonuç = " + cikarma);
        }else if(select == 3){
            System.out.println("sonuç = " + carpma);
        }else{
            System.out.println("sonuc = " + bolme);
        }

        }


    }

