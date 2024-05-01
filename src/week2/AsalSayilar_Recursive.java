package week2;

import java.util.Scanner;

public class AsalSayilar_Recursive {
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 1 ve daha küçük sayılar asal değildir
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // n, i'ye tam bölünüyorsa asal değildir
            }
        }
        return true; // Hiçbir sayıya tam bölünmediyse asaldır
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

}
