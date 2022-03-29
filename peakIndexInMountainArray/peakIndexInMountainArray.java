// 852. Peak Index in a Mountain Array
// Let's call an array arr a mountain if the following properties hold:
//     arr.length >= 3
//     There exists some i with 0 < i < arr.length - 1 such that:
//         arr[0] < arr[1] < ... arr[i-1] < arr[i]
//         arr[i] > arr[i+1] > ... > arr[arr.length - 1]
// Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
// Example 1:
// Input: arr = [0,1,0]
// Output: 1

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        int ans = peakIndex(arr);
        System.out.println(ans);
    }

    public static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
