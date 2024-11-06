package Codingbat.Recursion_1;

public class StrCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("iiijjj","ii",2));
    }
    public static boolean strCopies(String str, String sub, int n) {
        int a=0;
        for (int i =0; i< str.length()-sub.length()+1; i++){
            if (str.substring(i,i+sub.length()).equals(sub)){
                a++;
            }
        }
        if (a==n){
            return true;
        }
        return false;
    }
}
