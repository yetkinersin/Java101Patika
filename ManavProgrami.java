package Patika3;

import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
        double toplamFiyat;

        System.out.print("Armut kilosunu giriniz: ");
        armutKilo = input.nextInt();

        System.out.print("Elma kilosunu giriniz: ");
        elmaKilo = input.nextInt();

        System.out.print("Domates kilosunu giriniz: ");
        domatesKilo = input.nextInt();

        System.out.print("Muz kilosunu giriniz: ");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan kilosunu giriniz: ");
        patlicanKilo = input.nextInt();

        toplamFiyat = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) +
                (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam fiyat = " + toplamFiyat);


    }
}