package Codingbat.Array_1;

public class Double23 {
    public boolean double23(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums.length<2){
                return false;
            }
            if (nums[0]==2 && nums[0]==nums[1] || nums[0]==3 && nums[0]==nums[1] ){
                return true;
            }
        }
        return false;
    }
}
