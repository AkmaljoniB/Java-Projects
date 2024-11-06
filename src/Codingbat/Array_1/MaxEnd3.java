package Codingbat.Array_1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int []arr = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            if (nums[0]>nums[nums.length-1]){
                arr[i]=nums[0];
            }
            if (nums[0]<nums[nums.length-1]){
                arr[i]=nums[nums.length-1];
            }
            if (nums[0] == nums[nums.length-1]){
                arr[i]=nums[nums.length-1];
            }
        }
        return arr;
    }
}
