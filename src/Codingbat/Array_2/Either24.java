package Codingbat.Array_2;

public class Either24 {
    public boolean either24(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length == i + 1) {
                break;
            }
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                return true;
            }
        }
        return false;
    }
}
