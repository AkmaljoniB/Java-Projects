package Codingbat.Functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-5);
        list.add(2);
        list.add(-3);
        list.add(3);
        list.add(10);
        System.out.println(noNeg(list));
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        for (int i = 0 ; i < nums.size();i++){
            if (nums.get(i)<0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }
}