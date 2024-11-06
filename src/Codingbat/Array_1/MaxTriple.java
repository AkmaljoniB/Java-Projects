package Codingbat.Array_1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[0]){
                max = nums[0];
            }
            if (max<nums[nums.length-1]){
                max = nums[nums.length-1];
            }
            if (max<nums[nums.length/2]){
                max = nums[nums.length/2];
            }
        }
        return max;
    }
}
