package week2;

import java.util.Arrays;

public class ArrayFrequency {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = new int[numbers.length];
        Arrays.fill(visited, -1);  // visited dizisinin tüm elemanlarını -1 ile doldurur.

        System.out.println("Tekrar Sayıları:");

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;  // Şu anki elemanın kendisi için frekans başlangıcı.
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {  // Eğer iki eleman eşitse
                    count++;  // Frekansı artır
                    visited[j] = 0;  // İkinci elemanı ziyaret edilmiş olarak işaretle
                }
            }

            // Eğer eleman daha önce ziyaret edilmemişse, frekansını yazdır
            if (visited[i] != 0) {
                visited[i] = count;  // Frekansı visited dizisine ekle
                System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
