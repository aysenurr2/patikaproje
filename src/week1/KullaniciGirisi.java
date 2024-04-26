package week1;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, yeniSifre, sifirlama;

        // kullanıcıdan bilgileri alma
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();


        // kullanıcı başarılı giriş
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız ! ");
        } else {
            System.out.println("Şifre Hatalı!. Şifrenizi sıfırlamak istiyor musunuz? (Evet/Hayır) : ");
            sifirlama = inp.nextLine();


            // Şifre Sıfırlama
            if (sifirlama.equals("Evet")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                yeniSifre = inp.nextLine();


                // Yeni şifrenin kontrolü
                if (yeniSifre.equals(password)) {
                    System.out.println("Yeni şifre eski şifre ile aynı olamaz. Lütfen farklı bir şifre giriniz.");
                }
                else {
                    System.out.println("Şifre Oluşturuldu. ");
                }
            }
        }
    }
}