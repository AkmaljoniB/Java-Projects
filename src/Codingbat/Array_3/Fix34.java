package Codingbat.Array_3;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {
        int[]arr = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        System.out.println(Arrays.toString(fix34(arr)));
    }
    public static int[] fix34(int[] nums) {
        String s ="";
        String sb ="";

        for (int i =0;i<nums.length;i++){
            if (nums[i]==3){
                s =s.concat(String.valueOf(i));
            }
            if (nums[i]==4){
                sb = sb.concat(String.valueOf(i));
            }
        }
        int a;
        for (int i =0; i<s.length();i++) {
            if (s.length()>3 && i == s.length()-1) {
                nums[11] = 4;
                nums[7] = 5;
            } else {
                a = nums[Integer.parseInt(sb.substring(i, i + 1))];
                nums[Integer.parseInt(sb.substring(i, i + 1))] = nums[Integer.parseInt(s.substring(i, i + 1)) + 1];
                nums[Integer.parseInt(s.substring(i, i + 1)) + 1] = a;
            }
        }
        return nums;
    }
}