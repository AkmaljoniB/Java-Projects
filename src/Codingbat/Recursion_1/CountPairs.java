package Codingbat.Recursion_1;

public class CountPairs {
    public int countPairs(String str) {
        int a =0;
        for (int i =0; i<str.length()-2;i++){
            if (str.substring(i,i+1).equals(str.substring(i+2,i+3))){
                a++;
            }
        }
        return a;
    }
}