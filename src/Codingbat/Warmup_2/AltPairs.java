package Codingbat.Warmup_2;

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("Chocolate"));
    }
    public static String altPairs(String str) {
        String s = "";
        char[]arr = str.toCharArray();
        for (int i = 0; i < str.length(); i=i+4) {
            if (str.length() - 1 == i) {
                break;
            } else {
                s = s + arr[i] + arr[i + 1];
            }
        }
        if (str.length()<=2){
            return str;
        }
        return s;
    }
}
