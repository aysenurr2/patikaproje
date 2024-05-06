package week2;

import java.util.Scanner;

public class Metot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısı : ");
        int n = inp.nextInt();
        System.out.println("Çıktısı : ");
        recursiveMethod(n);
    }

    // Recursive metot
    public static void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.print("0 ");
        } else {
            System.out.print(n + " ");
            recursiveMethod(n - 5); // n'den 5 çıkararak metodu tekrar çağır
            System.out.print(n + " ");
        }
    }
}


