package Codingbat.Logic_2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) < Math.abs(c - a) && Math.abs(c - a) > 2) {
            return true;
        }
        if (Math.abs(b - a) > Math.abs(c - a) && Math.abs(b - a) > 2) {
            return true;
        }
        if (Math.abs(a-b)>=2 && Math.abs(b-c)>=2 || Math.abs(a-c)>=2 && Math.abs(b-c)>=2){
            return true;
        }
        return false;
    }
}
