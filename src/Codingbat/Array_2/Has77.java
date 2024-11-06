package Codingbat.Array_2;

public class Has77 {
    public boolean has77(int[] nums) {
        if (nums.length==1){
            return false;
        }
        for (int i = 0; i < nums.length; i++){
            if (nums.length == i +1){
                break;
            }
            if (nums[i]==7 && nums[i+1]==7){
                return true;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums.length == i +2){
                break;
            }
            if (nums[i]==7 && nums[i+2]==7){
                return true;
            }
        }
        return false;
    }
}
