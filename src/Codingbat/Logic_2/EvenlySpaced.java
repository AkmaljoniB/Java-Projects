package Codingbat.Logic_2;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        if (a==b && b==c){
            return true;
        }
        if (a==b || b==c||c==a){
            return false;
        }
        if (Math.abs(a - b) == Math.abs(b - c)){
            return true;
        }
        if (Math.abs(b - c) == Math.abs(c - a)) {
            return true;
        }
        if (Math.abs(a - c) == Math.abs(b - a)){
            return true;
        }
        return false;
    }
}
