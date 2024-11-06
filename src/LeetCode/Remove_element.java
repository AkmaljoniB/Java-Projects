package LeetCode;

import java.util.Arrays;

public class Remove_element {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=val)k++;
            else nums[i]=Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        return k;
    }
}
