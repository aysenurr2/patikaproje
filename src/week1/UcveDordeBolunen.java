package week1;

import java.util.Scanner;

public class UcveDordeBolunen {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k = inp.nextInt();

        int toplam = 0;
        int adet = 0;

        // 0'dan k'ya kadar olan sayıları kontrol eder
        for (int i = 0; i <= k; i++) {
            // Eğer i hem 3'e hem de 4'e tam bölünüyorsa
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet; // Ortalamayı hesapla
            System.out.println("0'dan " + k + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("0'dan " + k + "'e kadar olan sayılar arasında 3 ve 4'e tam bölünen bir sayı yok.");
        }
    }
}

