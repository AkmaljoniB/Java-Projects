package Codingbat.Array_2;

public class ShiftLeft {
    public static void main(String[] args) {
        int[]arr = {6,2,5,3};
        System.out.println(shiftLeft(arr));
    }
    public static int[] shiftLeft(int[] nums) {
        int[]arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (i+1==nums.length){
                arr[nums.length-1]=nums[0];
                break;
            }
            arr[i]=nums[i+1];
        }
        return arr;
    }
}
