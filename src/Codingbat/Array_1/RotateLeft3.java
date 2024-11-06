package Codingbat.Array_1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i - 1] = nums[i];
        }
        arr[nums.length-1] = n;
        return arr;
    }
}
