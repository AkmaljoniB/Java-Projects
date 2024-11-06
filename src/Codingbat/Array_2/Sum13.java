package Codingbat.Array_2;

public class Sum13 {
    public int sum13(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length;i++){
            if (nums[i]<13) {
                s += nums[i];
            } else {
                i++;
            }
        }
        return s;
    }

}
