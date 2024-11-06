package Codingbat.String_1;

public class MiddleThree {
    public String middleThree(String str) {
        if (str.length()<3){
            return str;
        }
        return str.substring(str.length()/2-1, str.length()/2+2);
    }
}
