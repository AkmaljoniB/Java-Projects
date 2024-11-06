package Codingbat.Warmup_2;

public class StringX {
    public String stringX(String str) {
        String s ="";
        char[] arr = str.toCharArray();
        if (str.length()<=1){
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[i]!='x'){
                s = s + arr[i];
            }
        }
        if(str.substring(0, 1).equals("x") && str.substring(str.length()-1).equals("x")){
            return "x"+s + "x";
        }
        if (str.substring(0, 1).equals("x")){
            return "x"+s;
        }
        if (str.substring(str.length()-1).equals("x")){
            return s+"x";
        }
        return s;
    }
}
