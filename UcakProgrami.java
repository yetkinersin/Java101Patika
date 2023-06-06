package Patika4;

import java.util.Scanner;

public class UcakProgrami
{
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double mesafeBasiTutar=0.10;
        Scanner input=new Scanner(System.in);
        System.out.println("Uçak Bileti Uygulamamıza Hoşgeldiniz !!\n");

        System.out.print("Gideceğiniz mesafeyi(km) giriniz : ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas=input.nextInt();
        System.out.println("Yolculuk tipinizi giriniz : \n1-Tek Yön\n2-Gidiş Dönüş");
        yolculukTipi= input.nextInt();

        double toplamFiyat=mesafeBasiTutar*mesafe;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)){
            if (yas<12){
                toplamFiyat*=0.50;
            }else if (12<=yas && yas<=24){
                toplamFiyat*=0.90;
            } else if (yas>65) {
                toplamFiyat*=0.70;
            }
            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8;
        }
            System.out.println("Toplam Fiyatınız : "+toplamFiyat);
    }else
            System.err.println("Hatalı giriş yaptınız,Tekrar Deneyiniz");

}
}
