package week2;


import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {


        System.out.println("Dizinin Boyutunu Giriniz : ");
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] numbers = new int[size];

        System.out.println("Dizinin elemanlarını giriniz. ");
        for (int i = 0 ; i < numbers.length ; i++ ){
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            numbers[i] = inp.nextInt();
        }
        Arrays.sort(numbers);

        System.out.println("Sıralama : " + Arrays.toString(numbers));

    }

}
