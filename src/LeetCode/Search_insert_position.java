package LeetCode;

public class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target<=nums[i])return i;
        }
        return nums.length;
    }
}
