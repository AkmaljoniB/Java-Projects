package Codingbat.Array_3;

public class CanBalance {
    public static void main(String[] args) {
        int[] arr = {10, 0, 1, -1, 10};
        System.out.println(canBalance(arr));
    }

    public static boolean canBalance(int[] nums) {
        int s = 0, d = 0;
        if (nums.length < 2) {
            return false;
        }
        if (nums.length % 2 != 0) {
            int a = 0;
            for (int i = 0; i < nums.length; i++) {
                a = a + nums[i];
                if (i == nums.length - 2 && a == nums[nums.length - 1]) {
                    return true;
                }
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            s = s + nums[i];
        }
        for (int i = nums.length / 2; i < nums.length; i++) {
            d = d + nums[i];
        }
        if (nums.length % 2 != 0) {
            if (d == s || s + nums[nums.length / 2 + 1] == d) {
                return true;
            }
        } else if (d == s) {
            return true;
        }
        return false;
    }
}