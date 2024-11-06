package Codingbat.Array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[nums.length * 2 - 1] = nums[nums.length - 1];
        }
        return arr;
    }
}
