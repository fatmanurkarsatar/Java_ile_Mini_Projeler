import java.util.Scanner;

public class sicakliga_gore_etkinlik_onerme {

    public static void main(String[] args) {

        //kullanıcının girdiği sıcaklık durumuna göre aşağıdaki
        //etkinlikleri öneren program
        //sıcaklık 5 ten küçük ise "kayak" yapmayı öner
        //sıcaklık 5 ve 15 arassındaysa "tiyatro" etkinliğini öner
        // sıcaklık 15-25 arasındaysa "mangal" etkinliğini öner
        //sıcaklık 25 den büyük ise yüzme etkinliğini öner

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sıcaklık değeri giriniz:");
        float sicaklik = scan.nextFloat();

        if(sicaklik<5){
            System.out.println("kayak yapabilirsiniz");
        }else if(5<=sicaklik && sicaklik<15){
            System.out.println("tiyatroya giddebilirsiniz");
        }else if(15<=sicaklik && sicaklik<25){
            System.out.println("mangal yapabilirsiniz");
        }else{
            System.out.println("yüzmeye gidebilirsiniz");
        }

    }
}
