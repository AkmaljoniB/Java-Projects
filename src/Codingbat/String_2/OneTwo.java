package Codingbat.String_2;

public class OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("1234567890"));
    }

    public static String oneTwo(String str) {
        String s = "";
        int a = str.length();
        if (str.length()<3){
            return "";
        }
        if (a % 3 != 0) {
            a--;
        }
        if (a % 3 == 0) {
            for (int i = 0; i < a; i = i + 3) {
                if (str.length() - 2 == i + 3) {
                    break;
                }
                s = s.concat(str.substring(i + 1, i + 3)).concat(str.substring(i, i + 1));
            }
            return s;
        }
        if (a % 3 != 0) {
            a--;
        }
        for (int i = 0; i < a; i = i + 3) {
            if (str.length() - 2 == i + 3) {
                break;
            }
            s = s.concat(str.substring(i + 1, i + 3)).concat(str.substring(i, i + 1));
        }
        return s.concat(str.substring(str.length()-4,str.length()-2)).concat(str.substring(str.length()-5,str.length()-4));
    }
}
