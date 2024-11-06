package Codingbat.String_2;

public class DoubleChar {
    public String doubleChar(String str) {
        String s="";
        char[] charArray = str.toCharArray();
        for (char element: charArray){
             s=s+element+element;
        }
        return s;
    }
}
