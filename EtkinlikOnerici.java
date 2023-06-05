package Patika4;
import java.util.Scanner;
public class EtkinlikOnerici
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int heat;
        System.out.println("Etkinlik Önericiye Hoşgeldiniz!!");
        System.out.print("Hava sıcaklığını giriniz : ");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Hava sıcaklığı : "+heat+"\'Kayak\' yapabilirsiniz ");
        } else if ((heat>=5)&& (heat<=15))  {
            System.out.println("Hava sıcaklığı : "+heat+"\'Sinema Etkinliği\' yapabilirsiniz ");
        }
        else if ((heat>=15)&&(heat<=25)){
            System.out.println("Hava sıcaklığı : "+heat+"\'Piknik\' yapabilirsiniz ");
        }
        else
            System.out.println("Hava sıcaklığı :" +heat+"\'Yüzme\' yapabilirsiniz");


    }
}
