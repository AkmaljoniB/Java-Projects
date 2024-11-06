package Codingbat.String_2;

public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("1.xyz.xyz2.xyz"));
    }
    public static boolean xyzThere(String str) {
        if (str.length()<3){
            return false;
        }
        if (str.length()>3){
            if (str.substring(str.length()-4,str.length()-3).equals(".")&&str.substring(str.length()-3).equals("xyz")){
                return false;
            }
            if (str.substring(str.length()-3).equals("xyz")) {
                return true;
            }
        }
        for (int i =0; i < str.length();i++) {
            if (str.length()-2 == i){
                break;
            }
            if (i!=0 && str.substring(i-1,i).equals(".") && str.substring(i,i+3).equals("xyz")){
                return false;
            }
            if (str.substring(i,i+3).equals("xyz")) {
                return true;
            }
        }
        if (str.substring(str.length()-3).equals("xyz")){
            return true;
        }
        return false;
    }
}