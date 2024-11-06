package Alexeev;

import java.util.Scanner;

public class Alexeev_0513 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long s=0,p=0;
        for (int i=2;i<=n;i++) s+=p=p*2+1;
        System.out.println(s);
    }
}
// 7   1 1 1 1 1 1 1  120 - 21  35  35  21  7  1
// 6   1 1 1 1 1 1    57  - 15  20  15  6   1
// 5   1 1 1 1 1      26  - 10  10  5   1
// 4   1 1 1 1        11  - 6   4   1
// 3   1 1 1          4   - 3   1
// 2   1 1            1   - 1