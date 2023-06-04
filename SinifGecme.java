package Patika4;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notMatematik, notFizik, notTurkce, notKimya, notMuzik;
        int dersSayisi = 0;
        double toplamNot = 0;

        System.out.print("Matematik notunu girin: ");
        notMatematik = input.nextInt();
        if (notMatematik >= 0 && notMatematik <= 100) {
            dersSayisi++;
            toplamNot += notMatematik;
        }

        System.out.print("Fizik notunu girin: ");
        notFizik = input.nextInt();
        if (notFizik >= 0 && notFizik <= 100) {
            dersSayisi++;
            toplamNot += notFizik;
        }

        System.out.print("Türkçe notunu girin: ");
        notTurkce = input.nextInt();
        if (notTurkce >= 0 && notTurkce <= 100) {
            dersSayisi++;
            toplamNot += notTurkce;
        }

        System.out.print("Kimya notunu girin: ");
        notKimya = input.nextInt();
        if (notKimya >= 0 && notKimya <= 100) {
            dersSayisi++;
            toplamNot += notKimya;
        }

        System.out.print("Müzik notunu girin: ");
        notMuzik = input.nextInt();
        if (notMuzik >= 0 && notMuzik <= 100) {
            dersSayisi++;
            toplamNot += notMuzik;
        }

        if (dersSayisi > 0) {
            double ortalama = toplamNot / dersSayisi;

            if (ortalama >= 55) {
                System.out.println("Ortalama: " + ortalama);
                System.out.println("Geçtiniz.");
            } else {
                System.out.println("Ortalama: " + ortalama);
                System.out.println("Kaldınız.");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi.");
        }
    }
}
