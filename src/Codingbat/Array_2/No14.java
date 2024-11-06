package Codingbat.Array_2;

public class No14 {
    public boolean no14(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==1){
                a++;
            }
            if (nums[i]==4){
                b++;
            }
        }
        if (a >0 && b==0 || a==0 && b>0 || a==0 && b==0){
            return true;
        }
        return false;
    }
}
