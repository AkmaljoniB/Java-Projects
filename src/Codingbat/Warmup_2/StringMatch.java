package Codingbat.Warmup_2;

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("h", "hello"));
    }

    public static int stringMatch(String a, String b) {
        int c = 0;
        int l;
        String s;
        String s1;
        if (a.length()>b.length()){
            l=b.length();
        } else {
            l=a.length();
        }
        for (int i = 0; i < l-1; i++){
            s = a.substring(i, i+2);
            s1 = b.substring(i, i+2);
            if (s.equals(s1)){
                c++;
            }
        }
        return c;
    }
}
