package Patika4;
import java.util.Scanner;

public class SifreProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, answer, newPassword;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if (userName.equals("yetkin") && password.equals("patika")) {
            System.out.println("Giriş Yaptınız");
        } else if (userName.equals("yetkin") && !password.equals("patika")) {
            System.out.print("Şifre yanlış! Sıfırlamak ister misiniz? (Evet ya da Hayır) ");
            answer = inp.nextLine();

            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Önceden kullanmadığınız yeni şifre girin: ");
                newPassword = inp.nextLine();

                if (newPassword.equals("patika")) {
                    System.err.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else
                System.out.println("Şire Oluşturmadınız");
        }
        else
            System.err.println("Kullanıcı adı veya şifre yanlış");
    }
}
