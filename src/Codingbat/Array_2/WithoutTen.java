package Codingbat.Array_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        int[] arr = {10,10,5,0};
        System.out.println(Arrays.toString(withoutTen(arr)));
    }
    public static int[] withoutTen(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : nums){
            list.add(i);
        }
        int a =0;
        for (int i =0;i <list.size();i++){
            if (list.get(i)==10){
                a++;
                list.remove(i);
                i--;
            }
        }
        for (int i =0; i<a;i++){
            list.add(list.size(),0);
        }
        for (int i =0; i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
