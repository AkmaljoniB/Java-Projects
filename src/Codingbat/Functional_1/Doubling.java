package Codingbat.Functional_1;

import java.util.ArrayList;
import java.util.List;

public class Doubling {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            arrayList.add(i);
        }
        System.out.println(doubling(arrayList));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        for (int i = 0; i < nums.size();i++) {
            nums.set(i, nums.get(i) * 2);
        }
        return nums;
    }
}
