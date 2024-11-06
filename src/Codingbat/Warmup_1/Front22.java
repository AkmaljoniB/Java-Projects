package Codingbat.Warmup_1;

public class Front22 {
    public String front22(String str){
        String s ="";
        String d="";
        if (str.length()== 1){
            for (int i=0; i<3;i++){
                d = d.concat(str);
            }
            return d;
        }
        if (str.length()== 0){
            return "";
        }
        s = str.substring(0, 2)+str+str.substring(0, 2);
        return s;
    }
}
