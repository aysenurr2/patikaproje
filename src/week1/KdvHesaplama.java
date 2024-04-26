package week1;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        //kullanıcıdan hesaplanacak olan fiyatı isteme
        int fiyat;
        Scanner inp = new Scanner(System.in);
        System.out.print("fiyat giriniz : " );
        fiyat = inp.nextInt();
        // kdv tutarını hesapla


        if (fiyat >= 1000) {
            double kdvOrani1 = 0.08;
            double kdvTutari1 = fiyat * kdvOrani1;
            double toplamFiyat1 = fiyat + kdvTutari1;
            System.out.println("Kdv Tutarı:" + kdvTutari1);
            System.out.println("Toplam Fiyat: " + toplamFiyat1);
        }

            else if (fiyat >= 0) {
                double kdvOrani2 = 0.18;
                double kdvTutari2 = fiyat * kdvOrani2;
                double toplamFiyat2 = fiyat + kdvTutari2;
                System.out.println("Kdv Tutarı:" + kdvTutari2);
                System.out.println("Toplam Fiyat: " + toplamFiyat2);
        }

    }
}
