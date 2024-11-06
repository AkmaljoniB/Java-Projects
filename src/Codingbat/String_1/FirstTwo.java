package Codingbat.String_1;

public class FirstTwo {
    public String firstTwo(String str) {
        String s = "";
        if (str.length()<2){
            return str;
        }
        return s = str.substring(0,2);
    }
}
