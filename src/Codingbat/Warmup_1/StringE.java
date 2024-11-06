package Codingbat.Warmup_1;

public class StringE {
    public boolean stringE(String str){
        int c=0;
        char[] charArray = str.toCharArray();
        for (char element: charArray){
            if (element == 'e'){
                c++;
            }
        }
        if (c<=3 && c>=1){
            return true;
        }
        return false;
    }
}
