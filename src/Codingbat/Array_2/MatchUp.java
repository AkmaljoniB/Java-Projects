package Codingbat.Array_2;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int a = 0;
        for (int i = 0 ; i < nums1.length; i++){
            if (Math.abs(nums1[i]-nums2[i])==1 || Math.abs(nums1[i]-nums2[i])==2){
                a++;
            }
        }
        return a;
    }
}
