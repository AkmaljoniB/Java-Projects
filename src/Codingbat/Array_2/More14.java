package Codingbat.Array_2;

public class More14 {
    public boolean more14(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0 ; i  < nums.length; i++){
            if (nums[i]==1){
                a++;
            }
            if (nums[i]==4){
                b++;
            }
        }
        if (a>b){
            return true;
        } else {
            return false;
        }
    }
}
