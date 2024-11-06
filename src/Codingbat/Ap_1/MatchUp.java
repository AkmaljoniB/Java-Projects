package Codingbat.Ap_1;

public class MatchUp {
    public int matchUp(String[] a, String[] b) {
        int n =0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i].length()!=0 && b[i].length()!=0 && a[i].substring(0,1).equals(b[i].substring(0,1)))|| (a.length==0 && b.length==0)){
                n++;
            }
        }
        return n;
    }
}
