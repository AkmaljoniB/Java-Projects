package Codingbat.Array_2;

public class Post4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2};
        System.out.println(post4(arr));
    }

    public static int[] post4(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                a = i;
            }
        }
        int[] arr = new int[nums.length - a - 1];
        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int i = a + 1; i < nums.length; i++) {
                arr[i1] = nums[i];
                i1++;
            }
        }
        return arr;
    }
}
