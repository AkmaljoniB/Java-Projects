package Codingbat.Warmup_1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length()==1){
            return str;
        }
        if (str.length()==0){
            return "";
        }

        String s = str.substring(str.length()-1) + str.substring(1, str.length()-1)+str.substring(0, 1);
        return s;
    }
}