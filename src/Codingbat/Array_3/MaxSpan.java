package Codingbat.Array_3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        if (nums.length < 2 || nums[0] == nums[nums.length - 1]) {
            return nums.length;
        }
        return nums.length - 1;
    }
}
