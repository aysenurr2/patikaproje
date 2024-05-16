package week2;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan alma
        System.out.print("Matrisin satır sayısını girin: ");
        int row = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        // Matrisi kullanıcıdan alma
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluşturma
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisini yazdırma
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
