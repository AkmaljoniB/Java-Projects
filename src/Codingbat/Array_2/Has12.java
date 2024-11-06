package Codingbat.Array_2;

public class Has12 {
    public boolean has12(int[] nums) {
        int a =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                a=1;
            }
            if (a==1){
                if (nums[i]==2) {
                    return true;
                }
            }
        }
        return false;
    }
}
