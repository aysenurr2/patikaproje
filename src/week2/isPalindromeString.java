package week2;
import java.util.Scanner;

public class isPalindromeString {
    static boolean isPalindrome(String input) {
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kelime Giriniz : ");
        String input = inp.nextLine();


        System.out.println(isPalindrome(input));
    }
}
