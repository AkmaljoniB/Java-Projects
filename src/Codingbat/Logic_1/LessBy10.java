package Codingbat.Logic_1;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        int d = Math.max(a,b);
        int e = Math.max(d,c);
        int f = Math.min(a,b);
        int g = Math.min(f,c);
        if (e-g>=10){
            return true;
        }
        return false;
    }
}
