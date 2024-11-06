package Codingbat.Warmup_1;

public class DelDel {
    public String delDel(String str){
        if (str.length()<=3){
            return str;
        }
        if (str.substring(0, 3).equals("del")){
            return str.substring(3);
        }
        if (str.substring(1, 4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
        return str;
    }
}
