package Codingbat.Array_1;

public class Fix23 {
    public int[] fix23(int[] nums) {
        int []arr = new int[nums.length];
        for (int i = 0 ; i < nums[i]; i++){
            if (nums[i]==2){
                if (nums[i+1]==3) {
                    nums[i+1]=0;
                }
            }
            if (i+1 == nums.length){
                break;
            }
        }
        return nums;
    }
}
