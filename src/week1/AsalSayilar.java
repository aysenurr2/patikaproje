package week1;

public class AsalSayilar {
    public static void main(String[] args) {

        System.out.println("1 ile 100 arasındaki asal sayılar:");

        // 2'den 100'e kadar olan sayıları kontrol et
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;
            // 2'den o sayıya kadar olan tüm sayıları kontrol et
            for (int j = 2; j < i; j++) {
                // Sayıyı bölen bir sayı bulunursa, sayı asal değildir
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            //ekrana yazdır
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}