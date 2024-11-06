package Codingbat.Array_2;

public class TripleUp {
    public static void main(String[] args) {
        int []arr = {1, 4, 5, 6, 2};
        System.out.println(tripleUp(arr));
    }
    public static boolean tripleUp(int[] nums) {
        if (nums.length<3){
            return false;
        }
        for(int i = 0 ; i < nums.length;i++){
            if (i+2==nums.length){
                break;
            }
            if (nums[i]-nums[i+1]==-1 && nums[i+1]-nums[i+2]==-1){
                return true;
            }
        }
        return false;
    }
}
