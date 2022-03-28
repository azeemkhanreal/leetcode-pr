public class findUniqueElement {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 2, 7, 3, 4 };
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        System.out.println(x);
    }
}