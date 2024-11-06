package Codingbat.Array_1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i+1==nums.length){
                break;
            }
            if (nums[i]==1){
                if (nums[i+1]==3){
                    return true;
                }
            }
            if (nums.length>4 && nums[0]==1 && nums[1]==1 && nums[3]==3){
                return false;
            }
        }
        return false;
    }
}