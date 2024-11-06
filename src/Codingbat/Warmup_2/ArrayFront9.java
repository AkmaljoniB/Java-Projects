package Codingbat.Warmup_2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i<=3) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
