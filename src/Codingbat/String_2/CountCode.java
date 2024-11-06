package Codingbat.String_2;

public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("code"));
    }
    public static int countCode(String str) {
        int a =0;
        if (str.length()<3){
            return 0;
        }
        for (int i = 0; i < str.length();i++){
            if (i==str.length()-3){
                break;
            }
            if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
                a++;
            }
        }
        return a;
    }
}