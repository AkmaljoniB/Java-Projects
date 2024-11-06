package Codingbat.Array_2;

import java.util.Arrays;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (arr[j] == -1) {
                        arr[j] = nums[i];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (arr[j]== -1) {
                        arr[j] = nums[i];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
