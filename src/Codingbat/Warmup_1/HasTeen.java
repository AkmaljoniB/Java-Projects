package Codingbat.Warmup_1;

public class HasTeen {
    public static boolean hasTeen(int a, int b, int c){
        if (a>12 && a<20 || b>12 && b<20 || c>12 && c<20){
            return true;
        }
        return false;
    }
}
