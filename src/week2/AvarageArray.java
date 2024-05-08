package week2;

public class AvarageArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double harmonikSeriesSum = 0;

        for (int number : numbers) {
            harmonikSeriesSum += 1.0 / number;
        }

        double harmonikAvarage = numbers.length / harmonikSeriesSum;

        System.out.println(harmonikAvarage);
    }
}
