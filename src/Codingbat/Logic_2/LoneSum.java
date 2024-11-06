package Codingbat.Logic_2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a==b && a==c){
            return 0;
        }
        if (a==b){
            return c;
        }
        if (a==c){
            return b;
        }
        if (c==b){
            return a;
        }
        return a+b+c;
    }
}
