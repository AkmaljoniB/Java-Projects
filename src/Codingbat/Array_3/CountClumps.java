package Codingbat.Array_3;

public class CountClumps {
    public int countClumps(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                a++;
                i++;
            }
        }
        for (int i = 0; i < nums.length-3; i++) {
            if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2] && nums[i+2]==nums[i+3]){
                a--;
                break;
            }
        }
        return a;
    }
}
