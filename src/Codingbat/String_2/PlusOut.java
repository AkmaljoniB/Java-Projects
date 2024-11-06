package Codingbat.String_2;

public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word) {
        String s = "";
        for (int i = 0; i < str.length();i++){
            if (i<=str.length()-word.length()){
                if (str.substring(i,i+word.length()).equals(word)){
                    s+=word;
                    i+=word.length()-1;
                }
                else s += "+";
            }
            else s+= "+";
        }
        return s;
    }
}
