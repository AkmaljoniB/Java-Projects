package Codingbat.Ap_1;

public class SumHeights2 {
    public static int sumHeights(int[] heights, int start, int end) {
        int s = 0;
        for (int i = start; i < end; i++) {
            if (heights[i]<heights[i+1]) {
                s = s + (Math.abs(heights[i] - heights[i + 1]) * 2);
            } else {
                s = s + Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return s;
    }
}
