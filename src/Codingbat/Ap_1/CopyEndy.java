package Codingbat.Ap_1;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[]arr =new int[count];
        for (int i =0;i<nums.length;i++){
            if ((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100)){
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
