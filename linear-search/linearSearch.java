public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 64, 6, 8, 2, 13 };
        int target = 6;
        // selection sort algo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
