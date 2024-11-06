package Codingbat.Array_2;

public class TenRun {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] tenRun(int[] nums) {
        int[] arr = new int[nums.length];
        int a = 0;
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                a = nums[i];
                s++;
            } else {
                arr[i] = nums[i];
            }
            if (s == 1) {
                for (int i1 = i; i1 < nums.length; i1++) {
                    if (nums[i1] % 10 == 0) {
                        a = nums[i1];
                    }
                    if (s==2){
                        for (int i2 = i1; i2 < nums.length; i2++) {
                            arr[i1]=a;
                        }
                        break;
                    }
                    arr[i1]=a;
                }
                break;
            }
        }
        return arr;
    }
}