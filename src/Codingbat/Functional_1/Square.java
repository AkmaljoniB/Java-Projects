package Codingbat.Functional_1;

import java.util.List;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i)*nums.get(i));
        }
        return nums;
    }
}
