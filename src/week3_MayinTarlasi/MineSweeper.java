package week3_MayinTarlasi;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rows;
    private int cols;
    private char[][] board;
    private char[][] hiddenBoard;
    private boolean[][] revealed;
    private boolean isFirstMove = true;

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper();
        game.startGame();
    }

    public void startGame() {
        getBoardSize();
        createBoard();
        playGame();
    }

    public void getBoardSize() {
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Matris Boyutunu Giriniz (Satır-Sütun) : ");
            this.rows = inp.nextInt();
            this.cols = inp.nextInt();
            if (rows < 2 || cols < 2) {
                System.out.println("Minimum 2x2 boyutunda matris giriniz!");
            }
        } while (rows < 2 || cols < 2);
    }

    public void createBoard() {
        board = new char[rows][cols];
        hiddenBoard = new char[rows][cols];
        revealed = new boolean[rows][cols];

        for (char[] row : board) {
            Arrays.fill(row, '-');
        }
        for (char[] row : hiddenBoard) {
            Arrays.fill(row, '-');
        }
        int totalMines = rows * cols / 4;
        int minesPlaced = 0;
        Random random = new Random();
        while (minesPlaced < totalMines) {
            int randomRow = random.nextInt(rows);
            int randomCol = random.nextInt(cols);
            if (hiddenBoard[randomRow][randomCol] != '*') {
                hiddenBoard[randomRow][randomCol] = '*';
                minesPlaced++;
            }
        }
        // Mayınların Konumunu gösterir
        System.out.println("Mayınların Konumu:");
        printHiddenBoard();
    }

    public void playGame() {
        Scanner inp = new Scanner(System.in);
        while (true) {
            if (isFirstMove) { // İlk hamlede sadece bir kere hoşgeldiniz mesajını yazdırır
                System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
                isFirstMove = false;
            }
            printBoard();
            System.out.println("Satır Giriniz : ");
            int selectRow = inp.nextInt();
            System.out.println("Sütun Giriniz : ");
            int selectCol = inp.nextInt();
            if (selectRow < 0 || selectRow >= rows || selectCol < 0 || selectCol >= cols) {
                System.out.println("Geçersiz satır veya sütun numarası. Lütfen tekrar giriniz.");
                continue;
            }
            if (hiddenBoard[selectRow][selectCol] == '*') {
                System.out.println("Game Over !");
                break;
            } else {
                int count = countAdjacentMines(selectRow, selectCol);
                board[selectRow][selectCol] = (char) (count + '0');
                revealed[selectRow][selectCol] = true;
                if (isGameWon()) {
                    printBoard();
                    System.out.println("Oyunu Kazandınız !");
                    break;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (revealed[i][j]) {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    public void printHiddenBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(hiddenBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    public int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && hiddenBoard[i][j] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isGameWon() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!revealed[i][j] && hiddenBoard[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }
}
