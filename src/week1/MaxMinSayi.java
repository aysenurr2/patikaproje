package week1;

import java.util.Scanner;

public class MaxMinSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.println("Kaç tane Sayı Gireceksiniz : ");
        int n, num, min=0, max=0;
        n = inp.nextInt();


        // Girilen sayıları kontrol eder ve en büyük ile en küçük sayıları bulur
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ".Sayıyı giriniz : ");
            num = inp.nextInt();

            if (i == 0) {
                min = num;
                max = num;
            } else {
                // Diğer girişlerde, yeni girilen sayıları min ve max ile karşılaştırır
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }
        // En büyük ve en küçük sayıları ekrana yazdırır
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
}