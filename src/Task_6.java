import java.math.BigInteger;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        BigInteger a = BigInteger.ONE;
        for (long i = 2; i<=n; i++){
            a = a.multiply(BigInteger.valueOf(i));
        }
        String s = String.valueOf(a);
        char[] b = s.toCharArray();
        int c = 0;
        for (int i = b.length-1; i >= 0; i--){
            if (b[i] != '0'){
                break;
            } else {
                c++;
            }
        }
        System.out.println(s);
        System.out.println(c);
    }
}
