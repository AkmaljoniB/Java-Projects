package Codingbat.Array_1;

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++){
            for (int i1 = 0; i1< b.length; i1++){
                if (a[0]==b[0] || a[a.length-1]==b[b.length-1]){
                    return true;
                }
            }
        }
        return false;
    }
}
