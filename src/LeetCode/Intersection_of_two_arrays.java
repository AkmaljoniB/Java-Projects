package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_arrays {
    private static Set<Integer> asList(int[] array) {
        Set<Integer> res = new HashSet<>(array.length);
        for (int l : array) {
            res.add(l);
        }
        return res;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = asList(nums1);
        set.retainAll(asList(nums2));
        int[]arr =new int[set.size()];
        int i=0;
        for (int value:set){
            arr[i]=value;
            i++;
        }
        return arr;
    }
}
