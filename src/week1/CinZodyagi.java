package week1;

import java.util.Scanner;


public class CinZodyagi {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        int year = inp.nextInt();

        int zodyakIndex = year % 12;
        String zodyak = "";

        switch (zodyakIndex){
            // Çin zodyağı hesaplama
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default: System.out.println("Geçersiz tarih girdiniz.");
        }

        // Eğer bir zodyak bulunduysa ekrana yazdır
        if (!zodyak.isEmpty()) {
            System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
        }
    }
}