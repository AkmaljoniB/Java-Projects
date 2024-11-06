package Codingbat.Recursion_1;

public class ParenBit {
    public String parenBit(String str) {
        String s ="";
        int a =0;
        for (int i =0;i<str.length();i++){
            if (str.substring(i,i+1).equals(")")){
                s = s.concat(str.substring(i,i+1));
                break;
            }
            if (str.substring(i,i+1).equals("(") || a!=0){
                s = s.concat(str.substring(i,i+1));
                a++;
            }
        }
        return s;
    }
}
