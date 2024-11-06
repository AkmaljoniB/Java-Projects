package Codingbat.Warmup_1;

public class EndUp {
    public String endUp(String str){
        if (str.length()<=3){
            return str.toUpperCase();
        }
        String s=str.substring(str.length()-3);
        return str.substring(0, str.length()-3)+s.toUpperCase();
    }
}
