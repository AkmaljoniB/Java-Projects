package Codingbat.Array_2;

public class Sum67 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sum67(arr));
    }

    public static int sum67(int[] nums) {
        int s = 0;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[a] == 6) {
                if (nums[i] == 7) {
                    a=i+1;
                }
            } else {
                a++;
                s = s + nums[i];
            }
        }
        return s;
    }
}
