package Codingbat.Array_1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            int[] arr = new int[2];
            for (int i = 0; i < nums.length; i++) {
                arr[0] = nums[0];
                arr[1] = nums[1];
            }
            return arr;
        }
        if (nums.length == 1) {
            int[] arr = new int[1];
            for (int i = 0; i < nums.length; i++) {
                arr[0] = nums[0];
            }
            return arr;
        }
        int []arr = new int[0];
        return arr;
    }
}
