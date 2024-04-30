package week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        // İlk iki elemanı belirler
        int a = 0, b = 1;

        // Fibonacci serisini oluşturur
        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(a + " ");
            int toplam = a + b;
            a = b;
            b = toplam;
        }
    }
}
