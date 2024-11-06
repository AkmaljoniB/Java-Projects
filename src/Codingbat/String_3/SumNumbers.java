package Codingbat.String_3;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("a1234bb11"));
    }
    public static int sumNumbers(String str) {
        String s = "0123456789";
        String p ="0";
        int a =0,d =0,h=0;
        for (int i=0;i<str.length();i++){
            for (int j =0; j< s.length();j++){
                if (str.substring(i,i+1).equals(s.substring(j,j+1))){
                    a++;
                    break;
                } else {
                    h++;
                }
            }
            if (h==10){
                a=0;
            }
            h=0;
            if (a!=0) {
                p = p.concat(str.substring(i, i + 1));
            } else {
                d+=Integer.parseInt(p);
                p="0";
                a=0;
            }
        }
        return d+Integer.parseInt(p);
    }
}
