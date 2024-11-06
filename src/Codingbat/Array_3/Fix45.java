package Codingbat.Array_3;

import java.util.Arrays;

public class Fix45 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 4, 9, 5};
        System.out.println(Arrays.toString(fix45(arr)));
    }

    public static int[] fix45(int[] nums) {
        String s = "";
        String sb = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                s = s.concat(String.valueOf(i));
            } else if (nums[i] == 5) {
                sb = sb.concat(String.valueOf(i));
            }
            if (i>0 && nums[i]==5 && nums[i-1]==4){
                s = s.substring(0,s.length()-1);
                sb = sb.substring(0,sb.length()-1);
            }
        }
        int a;
        for (int i = 0; i < s.length(); i++) {
            a = nums[Integer.parseInt(sb.substring(i, i + 1))];
            nums[Integer.parseInt(sb.substring(i, i + 1))] = nums[Integer.parseInt(s.substring(i, i + 1)) + 1];
            nums[Integer.parseInt(s.substring(i, i + 1)) + 1] = a;
        }
        return nums;
    }
}
