package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Degree_of_an_array {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s = s + nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0, min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (max < e.getValue()) {
                max = e.getValue();
                int i = 0, j = nums.length;
                for (; i < j; i++) if (nums[i] == e.getKey()) break;
                j--;
                for (;j >= 0; j--) if (nums[j] == e.getKey()) break;
                min = j-i;
            } else if (max == e.getValue()) {
                int i = 0, j = nums.length;
                for (; i < j; i++) if (nums[i] == e.getKey()) break;
                j--;
                for (;j >= 0; j--) if (nums[j] == e.getKey()) break;
                min = Math.min(j-i, min);
            }
        }
        return min + 1;
    }
}
