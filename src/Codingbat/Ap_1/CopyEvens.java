package Codingbat.Ap_1;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[]arr =new int[count];
        for (int i =0;i<nums.length;i++){
            if (nums[i]%2==0){
                for (int j =0;j<count;j++){
                    if (arr[j]==0){
                        arr[j]=nums[i];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
