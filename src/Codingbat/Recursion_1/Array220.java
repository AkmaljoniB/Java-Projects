package Codingbat.Recursion_1;

public class Array220 {
    public boolean array220(int[] nums, int index) {

        for (int i =0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]/10){
                return true;
            }
        }
        return false;
    }
}
