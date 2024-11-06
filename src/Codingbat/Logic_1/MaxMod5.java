package Codingbat.Logic_1;

public class MaxMod5 {
    public int maxMod5(int a, int b) {
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        if (a==b){
            return 0;
        }
        if (a%5==b%5){
            return d;
        }
        return c;
    }
}
