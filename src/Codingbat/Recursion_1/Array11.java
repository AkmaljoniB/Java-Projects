package Codingbat.Recursion_1;

public class Array11 {
    public int array11(int[] nums, int index) {
        int a= 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]==11){
                a++;
            }
        }
        return a;
    }
}
