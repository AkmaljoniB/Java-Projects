package Codingbat.Recursion_1;

public class EndX {
    public String endX(String str) {
        int a = str.length();
        str = str.replace("x", "");
        a = a- str.length();
        for (int i =0; i<a;i++){
            str = str.concat("x");
        }
        return str;
    }
}
