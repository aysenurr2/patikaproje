package week1;

import java.util.Scanner;

public class ArtikYil_Hesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan veri alma
        System.out.println("Yıl Giriniz : ");
        yil = inp.nextInt();


        // Artık yıl hesaplama
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

    }

}
