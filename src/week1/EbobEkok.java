package week1;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        // Minimum değeri bulma
        int min;
        if (sayi1 < sayi2) {
            min = sayi1;
        } else {
            min = sayi2;
        }

        // EBOB hesaplama
        int ebob = 1;
        int i = 1;
        while (i <= min) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);

        input.close();
    }
}
