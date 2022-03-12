// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

public class findFirstAndLastPosInSortArr {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 10 };
        int target = 2;
        int[] res = findOcc(arr, target);
        System.out.println(res);
    }

    public static int[] findOcc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOcc = -1, lastOcc = -1;
        int mid;
        while (start <= end) {
            mid = start + (end - start / 2);
            if (arr[mid] == target) {
                firstOcc = mid;
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start / 2);
            if (arr[mid] == target) {
                lastOcc = mid;
                start = mid + 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { firstOcc, lastOcc };
    }

}