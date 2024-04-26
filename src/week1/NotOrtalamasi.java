package week1;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalama Notunuz : " + sonuc);


        // sınıfta kalma ve geçme durumu
        String durum = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);



    }
}
