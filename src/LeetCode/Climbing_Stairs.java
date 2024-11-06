package LeetCode;


public class Climbing_Stairs {
    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int p=1,c=1;
        for (int i = 2; i <=n ; i++) {
            c=p+c;
            p=c-p;
        }
        return c;
    }
}