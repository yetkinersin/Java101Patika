package Patika3;

import java.util.Scanner;

public class NotOrtalamasi {
    public  static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Ders Notunu Griniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Ders Notunu Griniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Ders Notunu Griniz : ");
        kimya = input.nextInt();

        System.out.print("Tarih Ders Notunu Griniz .: ");
        tarih = input.nextInt();

        System.out.print("Müzik Ders Notunu Griniz : ");
        muzik = input.nextInt();

        System.out.print("Türkçe Ders Notunu Griniz : ");
        turkce = input.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double sonuc = (toplam / 6.0);

        System.out.println("Ders Ortalamanız : " + sonuc);
        System.out.println(sonuc < 60 ? "Üzgünüm Kaldınız :(" : "Tebrikler Geçtiniz");


    }
}

