package Codingbat.Array_2;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        int a =0;
        if (nums.length==1 && nums[0]==2){
            return false;
        }
        if (nums.length<=1){
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length && nums[i] == 2 && nums[i + 1] == 2) {
                a++;
            }
            if (i + 1 != nums.length && nums[i] == 2 && nums[i + 1] != 2) {
                a--;
            }
        }
        if (nums[nums.length-1]==2 && nums[nums.length-2]!=2){
            a--;
        } else if (nums[nums.length-1]==2 && nums[nums.length-2]==2){
            a++;
        }
        if (a<0){
            return false;
        }
            return true;
    }
}
