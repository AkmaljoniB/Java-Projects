package Codingbat.Functional_1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,(nums.get(i)+1)*10);
        }
        return nums;
    }
}
