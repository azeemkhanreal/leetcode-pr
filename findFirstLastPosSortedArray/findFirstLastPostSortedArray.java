// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

import java.util.Arrays;

public class findFirstLastPostSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 2, 2, 2 };
        int target = 2;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int m = s + (e - s) / 2;
        int first = -1;
        while (s <= e) {
            if (target == nums[m]) {
                first = m;
                e = m - 1;
            }
            if (target > nums[m]) {
                s = m + 1;
            }
            if (target < nums[m]) {
                e = m - 1;
            }
            m = s + (e - s) / 2;
        }
        s = 0;
        e = nums.length - 1;
        m = s + (e - s) / 2;
        int last = -1;
        while (s <= e) {
            if (target == nums[m]) {
                last = m;
                s = m + 1;
            }
            if (target > nums[m]) {
                s = m + 1;
            }
            if (target < nums[m]) {
                e = m - 1;
            }
            m = s + (e - s) / 2;
        }
        int[] arr = { first, last };
        return arr;
    }

}
