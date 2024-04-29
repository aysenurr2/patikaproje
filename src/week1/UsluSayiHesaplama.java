package week1;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int k, n, total=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı Giriniz : ");
        k = inp.nextInt();
        System.out.println("Üs olacak sayıyı Giriniz : ");
        n = inp.nextInt();

        for(int i = 1; i<=k; i++){
            total *= n;
        }
        System.out.println(total);

    }

}
