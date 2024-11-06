package Codingbat.Functional_2;

import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%10 == 9){
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }
}
