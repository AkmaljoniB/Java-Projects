package Codingbat.Array_3;

public class MaxMirror {
    public static void main(String[] args) {
        int[] arr ={7, 1, 2, 9, 7, 2, 1};
        System.out.println(maxMirror(arr));
    }

    public static int maxMirror(int[] nums) {
        int a = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[nums.length - j-1]){
                    for (int f = i;f<nums.length-j;f++){
                        if (nums[f]==nums[nums.length-f-1-j+i]){
                            a++;
                        } else {
                            break;
                        }
                    }
                    if (max<a){
                        max=a;
                    }
                }
                a=0;
            }
        }
        return max;
    }
}