package Patika4;
import java.util.Scanner;
public class HesapMakinesi
{
    public static void main(String[] args) {
        int x1,x2,select;
        Scanner inp=new Scanner(System.in);
        System.out.println("Hesap Makinesine Hoşgeldiniz!!\n");
        System.out.print("İşlem yapmak istediğiniz birinci sayıyı giriniz :");
        x1=inp.nextInt();
        System.out.print("İşlem yapmak istediğiniz ikinci sayıyı giriniz :");
        x2=inp.nextInt();
        System.out.println("Hangi işlemi yapmak istiyorsunuz :");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=inp.nextInt();


        switch (select){
            case 1:
                System.out.println("Seçtiğiniz işlem :\'Toplama\'");
                System.out.println("Cevap: "+(x1+x2));
                break;
            case 2:
                System.out.println("Seçtiğiniz işlem :\'Çıkarma\'");
                System.out.println("Cevap: "+(x1-x2));
                break;
            case 3:
                System.out.println("Seçtiğiniz işlem :\'Çarpma\'");
                System.out.println("Cevap: "+(x1*x2));
                break;
            case 4:
                System.out.println("Seçtiğiniz işlem :\'Bölme\'");
                if(x2!=0){
                    System.out.println("Cevap: "+(x1/x2));
                }
                else
                    System.out.println("Bir sayı sıfıra bölünemez,tekrar deneyin");
                break;
            default:
                System.err.println("YANLIŞ SEÇİM YAPTINIZ");

        }

    }
}
