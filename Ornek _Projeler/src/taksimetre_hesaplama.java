import java.util.Scanner;

public class taksimetre_hesaplama {
    public static void main(String[] args) {
        //gidilen km verisine göre taksimetre tutarını
        // hesaplayıp ekrana yazdıran program
        //taksimetre km başına 2,20 tl tutmakta
        //kısa mesafe tutarı 20 tl. 20tl altında ki ücretlerde
        //yine 20 tl alınacaktır
        //taksimetre açılış ücreti 10 tl.

        Scanner scan = new Scanner(System.in);
        System.out.println("gittiğiniz km'yi giriniz:");
        double km = scan.nextDouble();

        double taksimetreUcret = 10 + (km*2.20);

        if(taksimetreUcret<20){
            taksimetreUcret = 20;
            System.out.println("taksimetre : " + taksimetreUcret);
        }else{
            System.out.println("taksimetre : " + taksimetreUcret);
        }
    }
}
