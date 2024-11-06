package Codingbat.Recursion_1;

public class PairStar {
    public static void main(String[] args) {
        System.out.println(pairStar("aaaa"));
    }
    public static String pairStar(String str) {
        String s ="";
        if (str.length()<1){
            return str;
        }
        for (int i =0;i<str.length()-1;i++){
            if (str.substring(i,i+1).equals(str.substring(i+1,i+2))){
                s = s.concat(str.substring(i,i+1)).concat("*");
            } else {
                s = s.concat(str.substring(i,i+1));
            }

        }
        return s.concat(str.substring(str.length()-1));
    }
}