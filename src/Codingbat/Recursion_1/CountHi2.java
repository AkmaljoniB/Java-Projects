package Codingbat.Recursion_1;

public class CountHi2 {
    public int countHi2(String str) {
        int a =0;
        if (str.length()<2){
            return 0;
        }
        for (int i=0; i<str.length()-2;i++){
            if (str.substring(i,i+2).equals("hi")){
                a++;
            }
            if (str.substring(i,i+3).equals("xhi")){
                a--;
            }
        }
        if (str.substring(str.length()-2).equals("hi")){
            a++;
        }
        return a;
    }
}
