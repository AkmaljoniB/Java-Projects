package Codingbat.String_1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (str.length()-1<=index){
            return str.substring(0,2);
        }
        if (index<=0){
            return str.substring(0,2);
        }
        return str.substring(index, index+2);
    }
}