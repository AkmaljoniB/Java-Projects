package Codingbat.Functional_2;

import java.util.List;

public class Square_56 {
    public List<Integer> square56(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,nums.get(i) * nums.get(i) + 10);
            if (nums.get(i) % 10 == 5 || nums.get(i) % 10 == 6) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }
}
