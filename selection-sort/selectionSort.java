import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 64, 6, 8, 2, 13 };
        // selection sort algo
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
