package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        BigInteger a= BigInteger.valueOf(1);
        for (int i =1;i<=f;i++){
            a =a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a);
//        System.out.println(getfactorial(f));
    }
//    public static BigInteger getfactorial(int f){
//        if (f<=1){
//            return BigInteger.valueOf(1);
//        } else {
//            return BigInteger.valueOf(f).multiply(getfactorial(f - 1));
//        }
//    }
}
