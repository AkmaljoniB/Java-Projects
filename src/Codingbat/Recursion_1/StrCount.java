package Codingbat.Recursion_1;

public class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("iiiijj","i"));
    }
    public static int strCount(String str, String sub) {
        int a=0;
        for (int i =0; i< str.length()-sub.length()+1; i++){
            if (str.substring(i,i+sub.length()).equals(sub)){
                a++;
                if (sub.length()>1) {
                    i++;
                }
            }
        }
        return a;
    }
}
