package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Non_coprime_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            if (r/2!=1 && r/2+r/2>=l) System.out.println((r/2)+" "+(r/2));
            else {
                BigInteger b=BigInteger.valueOf(r);
                int o=0;
                if (!b.isProbablePrime((int) Math.log(r))||r<100000) {
                    for (int i = 3; i <= r / 2; i++) {
                        if (r % i == 0) {
                            System.out.println((r - i) + " " + i);
                            o++;
                            break;
                        }
                    }
                }
                if (o==0)System.out.println(-1);
            }
        }
    }
}