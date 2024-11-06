package Codingbat.Warmup_2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String s ="";
        for (int i = 0; i < n; i++){
            s=s.concat(str);
        }
        return s;
    }
}
