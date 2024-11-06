package Codingbat.Warmup_2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length()<3){
            for (int i = 0 ; i < n; i++) {
                s = s.concat(str);
            }
            return s;
        }
        if (str.equals("")){
            return "";
        }
        for (int i = 0; i < n; i++){
            s= s.concat(str.substring(0,3));
        }
        return s;
    }
}
