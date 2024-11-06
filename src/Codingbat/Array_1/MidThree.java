package Codingbat.Array_1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int []arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[0]=nums[nums.length/2-1];
            arr[1]=nums[nums.length/2];
            arr[2]=nums[nums.length/2+1];
        }
        return arr;
    }
}
