package Codingbat.Array_2;

public class Has22 {
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length;i++){
            if (i+1==nums.length){
                break;
            }
            if (nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }
}
