package Codingbat.Warmup_2;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axaxax"));
    }

    static boolean doubleX(String str) {
        int a = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                break;
            }
            if (arr[i] == 'x') {
                if (arr[i + 1] == 'x') {
                    a++;
                } else {
                    break;
                }
            }
        }
        if (a > 0) {
            return true;
        }
        return false;
    }
}
