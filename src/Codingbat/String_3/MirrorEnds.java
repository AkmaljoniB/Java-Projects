package Codingbat.String_3;

public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("xxx"));
    }
    public static String mirrorEnds(String string) {
        String s = "";
        for (int i = 1 ;i  <= string.length();i++){
            StringBuilder f = new StringBuilder(string.substring(string.length()-i));
            if (string.substring(0,i).contentEquals(f.reverse())){
                s = string.substring(0,i);
            }
        }
        return s;
    }
}
