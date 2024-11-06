package Codingbat.Recursion_1;

public class ChangePi {
    public String changePi(String str) {
        if (str.length()<2){
            return str;
        }
        String s ="";
        for (int i=0;i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("pi")){
                s = s.concat("3.14");
                i++;
            } else {
                s = s.concat(str.substring(i,i+1));
            }
        }
        if (!str.substring(str.length()-2).equals("pi")){
            s=s.concat(str.substring(str.length()-1));
        }
        return s;
    }
}
