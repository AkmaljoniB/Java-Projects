package Codingbat.Array_2;

public class IsEverywhere {
    public static void main(String[] args) {
        int[]arr = {2, 1, 2, 1};
        System.out.println(isEverywhere(arr, 1));
    }
    public static boolean isEverywhere(int[] nums, int val) {
        if (nums.length<2){
            return true;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != val && nums[i + 1] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}
