package Codingbat.Array_2;

public class CountEvens {
    public int countEvens(int[] nums) {
        int a = 0;
        for (int i = 0; i <nums.length; i++){
            if(nums[i]%2!=1){
                a++;
            }
        }
        return a;
    }
}
