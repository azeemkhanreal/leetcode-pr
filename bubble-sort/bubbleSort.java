import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 64, 6, 8, 2, 13 };
        // bubble sort algo
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
