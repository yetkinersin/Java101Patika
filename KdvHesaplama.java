package Patika3;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar , kdvorani , kdvlitutar , kdvtutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını girin:");
        tutar = input.nextDouble();
        kdvorani = (tutar > 1000) ? 0.8 : 0.18;
        kdvtutari = tutar * kdvorani;
        kdvlitutar = tutar + kdvtutari;

        System.out.println("        ****");
        System.out.println("Ürünün fiyatı:"+tutar);
        System.out.println("KDV oranı:"+kdvorani);
        System.out.println("Ürüne eklenecek KDV fiyatı:"+kdvtutari);
        System.out.println("Ürünün KDV'li fiyatı:"+kdvlitutar);
    }
}