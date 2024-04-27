package week1;

import java.util.Scanner;

public class UcakBileti_Hesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;



        // Kullanıcıdan veri alma
        Scanner inp = new Scanner(System.in);
        System.out.println("KM Cinsinden Mesafe Giriniz : ");
        mesafe = inp.nextInt();

        System.out.println("Yaş Giriniz : ");
        yas = inp.nextInt();

        System.out.println("Yolculuk Tipi Giriniz (Tek Yön(1), Gidiş-Dönüş(2)) : ");
        yolculukTipi = inp.nextInt();

        // Geçerli değerleri kontrol et
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double toplamTutar = mesafe * 0.10 ;

            // Yaş indirimi
            if (yas <= 12) {
                toplamTutar *= 0.50;
            } else if (yas <= 24) {
                toplamTutar *= 0.90;
            } else if (yas >= 65) {
                toplamTutar *= 0.70;
            }

            // Yolculuk tipine göre indirim
            if (yolculukTipi == 2) {
                toplamTutar *= 0.80;
            }
            //Gidiş-dönüş yolculuk için toplam tutarı ikiyle çarp
            if (yolculukTipi == 2) {
                toplamTutar *= 2;}

            System.out.println("Toplam Tutar : " + toplamTutar);
        }

    }
}