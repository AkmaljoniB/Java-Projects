package Codingbat.Recursion_1;

public class NestParen {
    public static void main(String[] args) {
        System.out.println(nestParen("()()"));
    }
    public static boolean nestParen(String str) {
        int a =0,b=0;
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals("(") && !str.substring(i, i + 1).equals(")")) {
                return false;
            }
            if (str.substring(i, i + 1).equals("(")){
                a++;
            }
            if (str.substring(i, i + 1).equals(")")){
                b++;
            }
        }
        if (a==b){
            return true;
        }
        return false;
    }
}
