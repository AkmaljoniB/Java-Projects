package Codingbat.Array_2;

public class HaveThree {
    public static void main(String[] args) {
        int[]arr = {3,1,3,1,3};
        System.out.println(haveThree(arr));
    }
    public static boolean haveThree(int[] nums) {
        if (nums.length<6){
            return false;
        }
        int a = 0;
        for (int i = 0;i < nums.length; i ++){
            if (i!=nums.length-1 && nums[i]==3 && nums[i+1]!=3){
                a++;
            }
        }
        if (nums[nums.length-1]==3 && nums[nums.length-2]!=3){
            a++;
        }
        if (a == 3){
            return true;
        }
        return false;
    }
}
