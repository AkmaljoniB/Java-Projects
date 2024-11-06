package Codingbat.Recursion_2;

public class GroupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if ((nums.length == 1 && nums[0] == target) || nums.length == 0 || target == 0) {
            return true;
        }
        for (int i = start; i < nums.length; i++) {
            for (int j = start; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        for (int i = start; i < nums.length; i++) {
            for (int j = start; j < nums.length; j++) {
                for (int h = start; h < nums.length; h++) {
                    if (i != j && h != j && nums[i] + nums[j] + nums[h] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}