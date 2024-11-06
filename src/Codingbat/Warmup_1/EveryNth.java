package Codingbat.Warmup_1;

public class EveryNth {
    public String everyNth(String str, int n){
        String s= "";
        for (int i =0; i<str.length(); i= i+n){
            s=s.concat(str.substring(i, i+1));
        }
        return s;
//        return str.substring(0,1)+str.substring(n, n+1)+str.substring(n*2,n*2+1);
    }
}
