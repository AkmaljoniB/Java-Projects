package Codingbat.Warmup_2;


public class ArrayCount9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        int newArr = arrayCount(arr);
        System.out.println(newArr);
    }
    public static int arrayCount(int[] nums) {
        int a =0;
        for (int i = 0; i <nums.length;i++) {
            if (nums[i] == 9) {
                a++;
            }
        }
        return a;
    }
}