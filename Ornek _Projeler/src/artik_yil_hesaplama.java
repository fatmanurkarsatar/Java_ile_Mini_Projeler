import java.util.Scanner;

public class artik_yil_hesaplama {
    public static void main(String[] args) {
        /*
        kullanıcının girdiği yılın artık olup olmadığını
        bulan program
        artık yıl, miladi takvimde 365 yerine 366 günü olan yıl.
        bu fazladan gün (artık gün), normalde 38 gün olan şubat ayına
        29 şubatın eklenmesiyle elde edilir.

        - artık yıllar 4 rakamının katı olan yıllardır
        - 100'ün katı olan yıllardan sadece 400'e kalansız olarak
        bölünebilenler artık yıldır. 1700 1800 1900 artık yıl değildir.

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz: ");
        int yil = scan.nextInt();

        if(yil%4==0 && yil%100!=0){
            System.out.println( yil + " = artık yıldır");
        }else if(yil%400==0){
            System.out.println( yil + " = artık yıldır");
        }else{
            System.out.println( yil + " = artık yıl değildir");
        }
    }
}
