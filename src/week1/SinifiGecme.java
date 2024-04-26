package week1;

import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;


        Scanner inp = new Scanner(System.in);

            //kullanıcı verileri
            System.out.println("Matematik Notunuz: ");
            mat = inp.nextInt();

            System.out.println("Fizik Notunuz: ");
            fizik = inp.nextInt();

            System.out.println("Kimya Notunuz: ");
            kimya = inp.nextInt();

            System.out.println("Türkçe Notunuz: ");
            turkce = inp.nextInt();

            System.out.println("Müzik  Notunuz: ");
            muzik = inp.nextInt();


        // ders notları 0 ile 100 arası olmalı
        if (0 <= mat && mat <= 100 && 0 <= fizik && fizik <= 100 && 0 <= kimya && kimya <= 100 &&
                0 <= turkce && turkce <= 100 && 0 <= muzik && muzik <= 100) {
            double average =  (double) (mat + fizik + turkce + kimya + muzik) / 5;


        // Sınıfta kalma geçme durumu
            if (average <= 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else {
                System.out.println("Sınıfı Geçtiniz. ");
            }

        } else{
            System.out.println("Lütfen 0 ile 100 arasında not giriniz. ");
        }


    }
}
