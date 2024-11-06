package Codingbat.Recursion_1;

public class StringClean {
    public String stringClean(String str) {
        String s= "";
        for (int i = 0; i < str.length()-1;i++){
            if (!str.substring(i,i+1).equals(str.substring(i+1,i+2))){
                s =s.concat(str.substring(i,i+1));
            }
        }
        return s.concat(str.substring(str.length()-1));
    }
}