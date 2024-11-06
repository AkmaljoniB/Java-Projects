package Codingbat.Recursion_1;

public class CountABC {
    public int countAbc(String str) {
        int a=0;
        for (int i = 0;i<str.length()-2;i++){
            if (str.substring(i,i+3).equals("abc")||str.substring(i,i+3).equals("aba")){
                a++;
            }
        }
        return a;
    }
}
