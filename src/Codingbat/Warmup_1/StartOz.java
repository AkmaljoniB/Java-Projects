package Codingbat.Warmup_1;

public class StartOz {
    public String startOz(String str) {
        String s="";
        if (str.length()==1){
            return str;
        }
        if (str.length()==0){
            return "";
        }
        if (str.substring(0,1).equals("o")){
            s=s.concat("o");
        }
        if (str.substring(1,2).equals("z")){
            s=s.concat("z");
        }
        return s;
    }
}
