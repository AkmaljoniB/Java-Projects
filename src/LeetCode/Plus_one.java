package LeetCode;

import java.math.BigInteger;

public class Plus_one {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        if (digits[l - 1] == 9) {
            BigInteger p = BigInteger.valueOf(digits[0]);
            for (int i = 1; i < digits.length; i++) {
                p = p.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
            }
            p=p.add(BigInteger.ONE);
            String s = String.valueOf(p);
            int[] arr = new int[s.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(s.substring(i,i+1));
            }
            return arr;
        }
        digits[l - 1]++;
        return digits;
    }
}
