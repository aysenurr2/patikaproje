package week2;

import java.util.Scanner;

public class UsluSayi_Recursive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban Değeri Giriniz : ");
        int n = inp.nextInt();

        System.out.println("Üs Değeri Giriniz : ");
        int k = inp.nextInt();

        // usHesaplama metodu çağrılıyor ve sonuç ekrana yazdırılıyor
        System.out.println("Sonuç : " + usHesaplama(n, k));
    }

    // Üs hesaplama metodu, n^k işlemini yapar
    static int usHesaplama(int n, int k) {
        if (k == 0) {
            return 1;
        } else {
            // n^k = n * n^(k-1) formülü uygulanarak rekürsif olarak hesaplama yapılır
            return n * usHesaplama(n, k - 1);
        }
    }
}
