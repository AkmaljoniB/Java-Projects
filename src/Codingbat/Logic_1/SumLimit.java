package Codingbat.Logic_1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int s, d =0 , g, e=0;
        for (int i = 0; i < a; i++){
            if (a<10){
                break;
            }
            s = a/10;
            if (s<10){
                break;
            }
            d++;
        }
        for (int i = 0; i < a; i++){
            g = (a+b)/10;
            if(a+b<20 && a+b>=10){
                e++;
            }
            if (g<10){
                break;
            }
            e++;
        }
        if (d==e){
            return a+b;
        }
        return a;
    }
}
