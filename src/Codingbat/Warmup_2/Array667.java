package Codingbat.Warmup_2;

public class Array667 {
    public int array667(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length-1){
                break;
            }
            if (nums[i]==6 && nums[i+1]==6 || nums[i]==6 && nums[i+1]==7){
                a++;
            }
        }
        return a;
    }
}
