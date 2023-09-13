import java.util.Scanner;

public class burc_bulma {
    public static void main(String[] args) {
        /*
        kullanıcıdan doğum ayı ve gün değerlerini alıp burcunu buldur

        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("doğum ayınızı giriniz:");
        int ay = scan.nextInt();

        System.out.println("doğum gününüzü giriniz:");
        int gun = scan.nextInt();

        if (ay > 0 && ay < 13) {
            if(ay == 1) {
                if(gun>=1 && gun<=31){
                    if (gun <= 21) {
                        System.out.println("Burcunuz: Oğlak");
                    } else {
                        System.out.println("Burcunuz: Kova");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==2) {
                if(gun>=1 && gun<=28) {
                    if (gun <= 19) {
                        System.out.println("Burcunuz: Kova");
                    } else {
                        System.out.println("Burcunuz: Balık");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==3) {
                if(gun>=1 && gun<=31) {
                    if (gun <= 20) {
                        System.out.println("Burcunuz: Balık");
                    } else {
                        System.out.println("Burcunuz: Koç");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==4) {
                if(gun>=1 && gun<=30) {
                    if (gun <= 20) {
                        System.out.println("Burcunuz: Koç");
                    } else {
                        System.out.println("Burcunuz: Boğa");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==5) {
                if(gun>=1 && gun<=31) {
                    if (gun <= 21) {
                        System.out.println("Burcunuz: Boğa");
                    } else {
                        System.out.println("Burcunuz: İkizler");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==6) {
                if(gun>=1 && gun<=30) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: İkizler");
                    } else {
                        System.out.println("Burcunuz: Yengeç");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==7) {
                if(gun>=1 && gun<=31) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: Yengeç");
                    } else {
                        System.out.println("Burcunuz: Aslan");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==8) {
                if(gun>=1 && gun<=30) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: Aslan");
                    } else {
                        System.out.println("Burcunuz: Başak");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==9) {
                if(gun>=1 && gun<=31) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: Başak");
                    } else {
                        System.out.println("Burcunuz: Terazi");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==10) {
                if(gun>=1 && gun<=30) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: Terazi");
                    } else {
                        System.out.println("Burcunuz: Akrep");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==11) {
                if(gun>=1 && gun<=31) {
                    if (gun <= 21) {
                        System.out.println("Burcunuz: Akrep");
                    } else {
                        System.out.println("Burcunuz: Yay");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }
            if(ay==12) {
                if(gun>=1 && gun<=30) {
                    if (gun <= 22) {
                        System.out.println("Burcunuz: Yay");
                    } else {
                        System.out.println("Burcunuz: Oğlak");
                    }
                }else{
                    System.out.println("Hatalı veri girişi yaptınız tekrar giriniz!!!");
                }
            }

        } else {
            System.out.println("geçerli ay numarası ve gün giriniz!!!");
        }


        }
    }


