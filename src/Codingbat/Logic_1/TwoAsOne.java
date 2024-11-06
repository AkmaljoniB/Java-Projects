package Codingbat.Logic_1;

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        int f = Math.max(a,b);
        int g = Math.max(f,c);
        if (a==g && b+Math.abs(c)==a){
            return true;
        }
        if (b==g && a+Math.abs(c)==b){
            return true;
        }
        if (c==g && b+a==c){
            return true;
        }
        return false;
    }
}
