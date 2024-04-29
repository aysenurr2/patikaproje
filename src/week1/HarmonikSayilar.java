package week1;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int n ;
        n = inp.nextInt();
        double result = 0;

        for (int i = 1; i <= n ; i++){
            result += ((double) 1 /i) ;
        }
        System.out.println(result);
    }
}
