package Codingbat.String_2;

public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAAxyzBB"));
    }
    public static boolean xyzMiddle(String str) {
        if (str.length()<3){
            return false;
        }
        if (str.length()%2!=0){
            if (str.substring(str.length()/2-1,str.length()/2+2).equals("xyz")){
                return true;
            }
            return false;
        }
        if (str.substring(str.length()/2-2,str.length()/2+1).equals("xyz")||str.substring(str.length()/2-1,str.length()/2+2).equals("xyz")){
            return true;
        }
        return false;
    }
}
