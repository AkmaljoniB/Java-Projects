package Codingbat.String_1;

public class ExtraFront {
    public String extraFront(String str) {
        String s = "";
        if (str.length() > 1) {
            for (int i = 0; i < 3; i++) {
                s = s.concat(str.substring(0, 2));
            }
        }
        if (str.length()==1){
            for (int i = 0; i<3;i++){
                s=s.concat(str);
            }
        }
        return s;
    }
}
