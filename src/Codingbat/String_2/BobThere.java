package Codingbat.String_2;

public class BobThere {
    public boolean bobThere(String str) {
        if (str.length()<3){
            return false;
        }
        for (int i = 0; i < str.length();i++){
            if (str.length()-2==i){
                break;
            }
            if (str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b")){
               return true;
            }
        }
        return false;
    }
}
