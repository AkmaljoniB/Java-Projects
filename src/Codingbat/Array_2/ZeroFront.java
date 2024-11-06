package Codingbat.Array_2;

import java.util.Arrays;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        if (nums.length<2){
            return nums;
        } else if (nums[0] < 0) {
            for (int j = 0; j < nums.length; j++) {
                arr[j] = nums[nums.length - 1 - j];
            }
        } else {
            for (int j = 0; j < nums.length; j++) {
                arr[j] = nums[j];
            }
        }
        return arr;
    }
}
