package Codingbat.Warmup_2;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("xaxaxaxx"));
    }
    public static int last2(String str){
        int s = 0;
        if (str.length()<=2){
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+2).equals(str.substring(str.length()-2))){
                s++;
            }
            if (i+2==str.length()){
                break;
            }
        }
        if (s==0){
            return 0;
        }
        return s-1;
    }
}
