package week1;
import java.util.Scanner;

public class VucutKitle_Indeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy, kilo, kitleIndeksi;
        System.out.println("Lütfen boyunuzu (metre cinsinde)  giriniz : ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        kitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleIndeksi);




    }
}
