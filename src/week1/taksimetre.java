package week1;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
    int km;
    double perKm = 2.20, total, startPrice = 10;
    Scanner input = new Scanner(System.in);

    System.out.print("Tutarı hesaplanacak KM giriniz : ");
    km = input.nextInt();
    total = (km * perKm);
    total += startPrice;

    if (total > 20) {
        System.out.println(total);
    } else {
        System.out.println("Ödemeniz Gereken Tutar : 20");
    }

    }
}
