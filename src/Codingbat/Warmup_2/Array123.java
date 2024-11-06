package Codingbat.Warmup_2;


public class Array123 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        boolean newArr = array123(arr);
        System.out.println(newArr);
    }

    public static boolean array123(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                a++;
            }
            if (nums[i] == 2) {
                b++;
            }
            if (nums[i] == 3) {
                c++;
            }
        }
        if (a > 0) {
            d++;
        }
        if (b > 0) {
            d++;
        }
        if (c > 0) {
            d++;
        }
        if (d >= 3) {
            return true;
        }
        return false;
    }
}
