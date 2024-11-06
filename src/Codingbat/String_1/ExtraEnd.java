package Codingbat.String_1;

public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
    public static String extraEnd(String str){
        String s = "";
        if (str.length()<2){
            for (int i=0; i<3;i++){
                s = s.concat(str);
            }
            return s;
        }
        for (int i = 0; i < 3 ; i++){
            s = s.concat(str.substring(str.length()-2));
        }
        return s;
    }
}
