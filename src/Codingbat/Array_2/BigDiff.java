package Codingbat.Array_2;

public class BigDiff {
    public static void main(String[] args) {
        int[]arr = {10, 3, 5, 6};
        System.out.println(bigDiff(arr));
    }
    public static int bigDiff(int[] nums) {
        int b =Integer.MIN_VALUE , c =Integer.MAX_VALUE;
        for (int i = 0; i <nums.length; i++){
            if(b<nums[i]){
                b= nums[i];
            }
            if(c>nums[i]){
                c= nums[i];
            }
        }
        return b-c;
    }
}
