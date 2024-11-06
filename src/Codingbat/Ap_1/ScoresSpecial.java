package Codingbat.Ap_1;

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int maxa=0, maxb=0;
        for (int i =0;i<a.length;i++) {
            if (a[i] % 10 == 0 && maxa < a[i]) {
                maxa = a[i];
            }
        }
        for (int i =0;i<b.length;i++){
            if (b[i]%10==0 && maxb<b[i]){
                maxb=b[i];
            }
        }
        return maxa+maxb;
    }
}