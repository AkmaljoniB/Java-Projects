package Codingbat.String_2;

public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));
    }
    public static boolean prefixAgain(String str, int n) {
        String s = str.substring(n-1,n);
        int a =0;
        for (int i = 0; i < str.length();i++){
            if (str.substring(i, i+1).equals(s)){
                a++;
            }
        }
        if (a>1){
            return true;
        }
        return false;
    }
}
