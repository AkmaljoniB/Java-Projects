package Codingbat.Array_1;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(swapEnds(arr)));
    }
    public static int[] swapEnds(int[] nums) {
        int a, b ;
        for (int i = 0; i < nums.length;i++){
            if (nums.length%2!=0) {
                a = nums[0];
                nums[0] = nums[nums.length - 1];
                nums[nums.length - 1] = a;
                break;
            }
            if (nums.length%2==0){
                b = nums[0];
                nums[0] = nums[nums.length - 1];
                nums[nums.length - 1] = b;
                break;
            }
        }
        return nums;
    }
}
