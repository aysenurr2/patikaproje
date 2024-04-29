package week1;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r;
        int totaln = 1;
        int totalr= 1;
        Scanner inp = new Scanner(System.in);


        System.out.println("n sayısını giriniz : ");
        n = inp.nextInt();

        System.out.println("r sayısını giriniz :");
        r = inp.nextInt();

        // n'in faktöriyelini hesapla
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }

        // r'in faktöriyelini hesapla
        for (int i = 1; i <= r; i++) {
            totalr *= i;
        }

        // n-r'in faktöriyelini hesapla
        int nMinusR = n - r;
        int totalnMinusR = 1;
        for (int i = 1; i <= nMinusR; i++) {
            totalnMinusR *= i;
        }
        // Kombinasyon formülünü uygula
        int kombinasyon = totaln / (totalr * totalnMinusR);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);


    }

}
