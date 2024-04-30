package week1;

    import java.util.Scanner;
public class ElmasYapimi {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Bir sayı giriniz (tek sayı): ");
            int n = input.nextInt();

            if (n % 2 == 0) {
                System.out.println("Lütfen tek bir sayı giriniz!");
                return;
            }

            // Üst kısmı oluşturma
            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Alt kısmı oluşturma
            for (int i = n - 2; i >= 1; i -= 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            input.close();
        }
    }

