package Codingbat.Functional_2;

import java.util.List;

public class Two_2 {
    public List<Integer> two2(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)*2)%10==2){
                nums.remove(i);
                i--;
            } else {
                nums.set(i,nums.get(i)*2);
            }
        }
        return nums;
    }
}
