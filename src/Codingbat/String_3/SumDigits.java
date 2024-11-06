package Codingbat.String_3;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
    }

    public static int sumDigits(String str) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                b = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            a += b;
            b=0;
        }
        return a;
    }
}
