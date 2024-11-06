package Codingbat.Array_2;

public class Only14 {
    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=4){
                if (nums[i]!=1) {
                    return false;
                }
            }
        }
        return true;
    }
}
