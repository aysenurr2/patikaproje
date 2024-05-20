package week2;


public class TekrarEdenSayi {
    static boolean isFind(int[] arr , int value){
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {18, 3, 4, 11, 15, 18, 4, 33, 1, 12, 4};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : dublicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
