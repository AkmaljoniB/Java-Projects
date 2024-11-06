package Codingbat.Recursion_1;

public class Array6 {
    public boolean array6(int[] nums, int index) {
        for (int i =0;i<nums.length;i++){
            if (nums[i]==6){
                return true;
            }
        }
        return false;
    }
}
