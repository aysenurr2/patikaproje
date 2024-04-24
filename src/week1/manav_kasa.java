package week1;
import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     int a, e, d, m, p;
     System.out.println("Armut kaç kilo ? : ");
     a = inp.nextInt();
     double armutFiyati = 2.14 * a;

     System.out.println("Elma kaç kilo ? : ");
     e = inp.nextInt();
     double elmaFiyati = 3.67 * e;

     System.out.println("Domates kaç kilo ? : ");
     d = inp.nextInt();
     double domatesFiyati = 1.11 * d;

     System.out.println("Muz kaç kilo ? : ");
     m = inp.nextInt();
     double muzFiyati = 0.95 * m;

     System.out.println("Patlıcan kaç kilo ? : ");
     p = inp.nextInt();
     double patlicanFiyati = 5 * p;

     double toplamTutar = (armutFiyati+elmaFiyati+domatesFiyati+muzFiyati+patlicanFiyati);
     System.out.println("Toplam Tutar : " + toplamTutar);




    }
}
