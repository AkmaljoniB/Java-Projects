package Codingbat.Recursion_1;

public class CountX {
    public int countX(String str) {
        int a=0;
        for (int i =0;i<str.length();i++){
            if (str.substring(i,i+1).equals("x")){
                a++;
            }
        }
        return a;
    }
}
