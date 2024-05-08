package week2;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int input = 5;

        int closestSmaller = Integer.MIN_VALUE; // Girilen sayıdan küçük en yakın sayı
        int closestGreater = Integer.MAX_VALUE; // Girilen sayıdan büyük en yakın sayı

        for (int num : arr) {
            if (num < input && num > closestSmaller) {
                closestSmaller = num;
            }
            if (num > input && num < closestGreater) {
                closestGreater = num;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Girilen Sayı : " + input);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreater);
    }
}
