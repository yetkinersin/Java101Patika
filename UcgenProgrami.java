package Patika3;
import java.util.Scanner;

public class  UcgenProgrami{
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs = " + c);

        double cevre = (a+b+c);
        double u = cevre / 2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Cevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);

    }
}