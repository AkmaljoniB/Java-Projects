package Codingbat.Array_1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length;i ++){
            arr[i]=nums[nums.length-i-1];
        }
        return arr;
    }
}
