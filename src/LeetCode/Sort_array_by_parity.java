package LeetCode;

public class Sort_array_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
}
