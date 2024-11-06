package Codingbat.Warmup_2;

public class StringBits {
    public String stringBits(String str){
        String s ="";
        for (int i = 0 ;i < str.length();i=i+2){
            s = s.concat(str.substring(i, i+1));
        }
        return s;
    }
}
