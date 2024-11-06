package Codeforces;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Chain_residues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer[]arr=new Integer[n];
            for (int i=0;i<n;i++)arr[i] = sc.nextInt();
            Arrays.sort(arr);
            if (Objects.equals(arr[0], arr[1])) {
                int p=-1;
                for (int i = 0;i<n;i++) {
                    if (arr[i]%arr[0]!=0) {
                        p=0;
                        break;
                    }
                }
                System.out.println(p==0?"YES":"NO");
            } else System.out.println("YES");
        }
    }
}