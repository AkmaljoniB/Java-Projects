package Codingbat.Recursion_1;

public class Count11 {
    public int count11(String str) {
        int a=0;
        for (int i = 0;i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("11")){
                a++;
                i++;
            }
        }
        return a;
    }
}
