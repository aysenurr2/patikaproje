package week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        //kullanıcıdan sayı alma
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();

        //kullancıya işlem seçtirme
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();

        // switch-case ile hesaplama
        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }




    }
}
