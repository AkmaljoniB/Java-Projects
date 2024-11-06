package Codingbat.Warmup_2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums.length-1==i){
                break;
            }
            if (nums[i]==1 && nums[i+1]==1){
                a++;
            }
            if (nums[i]==2 && nums[i+1]==2){
                b++;
            }
        }
        if (a<3 && b< 3){
            return true;
        }
        return false;
    }
}
