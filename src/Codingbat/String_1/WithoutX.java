package Codingbat.String_1;

public class WithoutX {
    public String withoutX(String str) {
        if(str.length()<2){
            return "";
        }
        if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            return str.substring(1, str.length()-1);
        }
        if (str.substring(0,1).equals("x")){
            return str.substring(1);
        }
        if (str.substring(str.length()-1).equals("x")){
            return str.substring(0, str.length()-1);
        }
        return str;
    }
}
