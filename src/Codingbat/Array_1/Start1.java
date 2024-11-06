package Codingbat.Array_1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int c = 0;
        if (a.length==0 && b.length==0){
            return 0;
        }
        for (int i = 0; i < a.length; i ++){
            if (a[0]==1){
                c++;
                break;
            }
        }
        for (int i = 0; i < b.length; i ++){
            if (b[0]==1){
                c++;
                break;
            }
        }
        return c;
    }
}
