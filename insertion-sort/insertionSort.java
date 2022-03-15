import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 43, 2, 32, 21 };
        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}