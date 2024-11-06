package Codingbat.Array_2;

public class SameEnds {
    public static void main(String[] args) {
        int arr[] = {0, 5, 2, 4, 5, 3, 4, 0, 5};
        System.out.println(sameEnds(arr, 2));
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }
}