package Codingbat.Warmup_1;

public class StartHi {
    public boolean startHi(String str){
        if (str.length()<=1){
            return false;
        }
        if (str.substring(0,2).equals("hi")){
            return true;
        }
        return false;
    }
}
