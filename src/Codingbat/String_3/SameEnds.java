package Codingbat.String_3;

public class SameEnds {
    public String sameEnds(String string) {
        String s = "";
        for (int i = 0 ;i  < string.length();i++){
            if (string.substring(0,i).equals(string.substring(string.length()-i)) && i<=string.length()/2){
                s = string.substring(0,i);
            }
        }
        return s;
    }
}