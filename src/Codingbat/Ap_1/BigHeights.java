package Codingbat.Ap_1;

public class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int s =0;
        for (int i = start; i<end;i++){
            if (Math.abs(heights[i]-heights[i+1])>=5){
                s++;
            }
        }
        return s;
    }
}
