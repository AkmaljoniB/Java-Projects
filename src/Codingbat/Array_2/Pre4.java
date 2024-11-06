package Codingbat.Array_2;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                break;
            }
            a++;
        }
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=nums[i];
        }
        return arr;
    }
}
