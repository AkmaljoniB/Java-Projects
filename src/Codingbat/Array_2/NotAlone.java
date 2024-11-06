package Codingbat.Array_2;

public class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        int arr[]=new int[nums.length];
        if(nums.length <2 || nums[nums.length-1]==2 && nums[1]==1 ){
            return nums;
        }
        for (int i = 0; i < nums.length;i++){
            arr[i]=nums[i];
        }
        for (int i = 0; i  <nums.length; i++){
            if (i!=0 && nums[i]==val && i!=nums.length-1){
                if (nums[i-1]>nums[i+1]){
                    arr[i]=nums[i-1];
                } else {
                    arr[i]=nums[i+1];
                }
            }
        }
        return arr;
    }
}
