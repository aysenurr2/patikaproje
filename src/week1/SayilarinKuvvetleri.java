package week1;

import java.util.Scanner;

public class SayilarinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);

        }
    }
}
