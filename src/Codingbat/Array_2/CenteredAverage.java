package Codingbat.Array_2;


public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int a= 0;
        int max = -1000,min =1000;
        for (int i =0;i<nums.length; i++) {
            a = a + nums[i];
            if (max<nums[i]){
                max = nums[i];
            }
            if (min>nums[i]){
                min = nums[i];
            }
        }
        return (a-max-min)/(nums.length-2);
    }
}
