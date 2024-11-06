package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Maximize_your_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[]arr=new int[n*2];
            for (int i=0;i<2*n;i++)arr[i] = sc.nextInt();
            Arrays.sort(arr);
            long sum=0;
            for (int i=0;i<2*n;i+=2)sum+=arr[i];
            System.out.println(sum);
        }
    }
}
