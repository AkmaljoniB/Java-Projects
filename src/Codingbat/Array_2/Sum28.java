package Codingbat.Array_2;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==2){
                s+=2;
            }
        }
        if (s==8){
            return true;
        }
        return false;
    }
}
