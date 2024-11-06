package Codingbat.String_2;

public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }
    public static String repeatFront(String str, int n) {
        String s = "";
        for (int i = n ; i > 0;i--){
            s=s.concat(str.substring(0, i));
        }
        return s;
    }
}
