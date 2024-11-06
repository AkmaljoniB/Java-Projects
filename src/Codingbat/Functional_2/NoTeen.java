package Codingbat.Functional_2;

import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)>12 && nums.get(i)<20){
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }
}
