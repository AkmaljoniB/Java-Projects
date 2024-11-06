package Codingbat.String_2;

public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cdh*hjk"));
    }

    public static String starOut(String str) {
        String s = "";
        for (int i = 0 ; i < str.length(); i++){
            if (i==0 && str.charAt(i) != '*'){
                s +=str.charAt(i);
            }
            if (i>0 && str.charAt(i)!= '*' && str.charAt(i-1)!='*'){
                s+=str.charAt(i);
            }
            if (i>0 && str.charAt(i)=='*' && str.charAt(i-1)!='*'){
                s = s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}