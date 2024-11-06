package Codingbat.Warmup_1;

public class Front3 {
    public String front3(String str){
        String s ="";
        String d="";
        if (str.length()<3){
            for (int i = 0; i <3;i++){
                d=d.concat(str);
            }
            return d;
        }
        for (int i = 0; i < 3; i++){
            s =s.concat(str.substring(0, 3));
        }
        return s;
    }
}
