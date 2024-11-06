package Codingbat.String_2;

public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadjambreadyy"));
    }
    public static String getSandwich(String str) {
        if(str.length()<11){
            return "";
        }
        for (int i = 0; i < str.length();i++){
            if (str.length()-5==i){
                break;
            }
            for (int i1=str.length();i1>0; i1--) {
                if (i1==str.length()-5){
                    break;
                }
                if (str.substring(i, i + 5).equals(str.substring(i1-5,i1))&& str.substring(i,i+5).equals("bread")){
                    return str.substring(i+5,i1-5);
                }
            }
        }
        return "";
    }
}
