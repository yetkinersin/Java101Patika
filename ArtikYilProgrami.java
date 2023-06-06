package Patika4;
import java.util.Scanner;
public class ArtikYilProgrami
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.println("Merhaba Artık Yıl Programına Hoşgeliniz !\n");
        System.out.print("Hesaplamak istediğiniz yılı giriniz :");
        yil=input.nextInt();

        if (yil>=0){
             if (yil%4==0){
                System.out.println(yil+" Yılı Artık Yıldır !");
            }
             else
                 System.out.println(yil+" Yılı Artık Yıl değildir !");
        }
        else
            System.err.println("Hatalı giriş yaptınız,Tekrar Deneyin");


    }

}
