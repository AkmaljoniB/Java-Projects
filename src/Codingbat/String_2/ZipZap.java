package Codingbat.String_2;

public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("abcppp"));
    }
    public static String zipZap(String str) {
        String s = "";
        String s1 = "";
        if (str.length()<3){
            return str;
        }
        for(int i = 0; i < str.length();i++){
            if (str.length()==i+2){
                break;
            }
            if (str.substring(i,i+1).equals("z") && str.substring(i+2,i+3).equals("p")){
                s = str.substring(0,i+1)+str.substring(i+2);
            }
        }
        if (s.length()==0){
            return str;
        }

        if (s.length()<3){
            return s;
        }
        for(int i = 0; i < s.length();i++){
            if (s.length()==i+3){
                break;
            }
            if (s.substring(i,i+1).equals("z") && s.substring(i+2,i+3).equals("p")){
                s1 = s.substring(0,i+1)+s.substring(i+2);
            }
        }
        if (s1.length()==0){
            return s;
        }
        return s1;
    }
}
