package Codingbat.String_2;

public class CountHi {
    public int countHi(String str) {
        int a = 0;
        for (int i = 0; i < str.length();i++){
            if (i==str.length()-1){
                break;
            }
            if (str.substring(i,i+2).equals("hi")){
                a++;
            }
        }
        return a;
    }
}
