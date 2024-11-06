package Codingbat.String_2;

public class XyBalance {
    public boolean xyBalance(String str) {
        int a=0, b=0;
        if (str.length()<2) {
            if (str.equals("x")) {
                return false;
            }
            return true;
        }
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i,i+1).equals("x")){
               a=i ;
            }
            if (str.substring(i,i+1).equals("y")){
                b=i ;
            }
        }
        if (a<b){
            return true;
        }
        return false;
    }
}
