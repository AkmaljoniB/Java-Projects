package LeetCode;

import java.math.BigInteger;

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
        BigInteger a =BigInteger.valueOf(Integer.parseInt(num1.substring(0,1)));
        for (int i = 1;i<num1.length();i++){
            a=a.multiply(BigInteger.TEN);
            a=a.add(BigInteger.valueOf(Integer.parseInt(num1.substring(i,i+1))));
        }
        BigInteger b =BigInteger.valueOf(Integer.parseInt(num2.substring(0,1)));
        for (int i = 1;i<num2.length();i++){
            b=b.multiply(BigInteger.TEN);
            b=b.add(BigInteger.valueOf(Integer.parseInt(num2.substring(i,i+1))));
        }
        return String.valueOf(a.multiply(b));
    }
}
