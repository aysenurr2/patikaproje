package week1;

import java.util.Scanner;

public class Pratik_CiftSayilarinToplami {
    public static void main(String[] args) {
        int k, total=0 ;

        Scanner inp = new Scanner(System.in);


        do {
            System.out.println("Sayı Giriniz : ");
            k = inp.nextInt();
            if ( k % 4 == 0 ){
                total += k;

            }
        }while (k % 2 == 0);

        System.out.println("Toplam : " + total);

    }
}
