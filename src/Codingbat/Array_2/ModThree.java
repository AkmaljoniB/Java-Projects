package Codingbat.Array_2;

public class ModThree {
    public boolean modThree(int[] nums) {
        if (nums.length<3){
            return false;
        }
        for (int i = 0; i < nums.length;i++){
            if (nums.length==i+2){
                break;
            }
            if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
                return true;
            }
            if (nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }
}
