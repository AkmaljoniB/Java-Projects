package Codingbat.Recursion_1;

public class ChangeXY {
    public String changeXY(String str) {
        String s ="";
        for (int i=0;i<str.length();i++){
            if (str.substring(i,i+1).equals("x")){
                s = s.concat("y");
            } else {
                s = s.concat(str.substring(i,i+1));
            }
        }
        return s;
    }
}
