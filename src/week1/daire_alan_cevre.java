package week1;
import java.util.Scanner;

public class daire_alan_cevre {
    public static void main(String[] args) {
        int r,teta;
        final double pi = 3.14;

        System.out.println("Yarıçapı Giriniz : ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        System.out.println("merkez açı ölçüsünü Giriniz : ");
        teta = input.nextInt();

        double alan = (pi * (r*r) * teta) / 360;
        System.out.println("Dairenin alanı : " + alan);



    }
}
