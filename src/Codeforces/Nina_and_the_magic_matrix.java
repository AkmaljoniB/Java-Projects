package Codeforces;

import java.util.Scanner;

public class Nina_and_the_magic_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long s=0;
            for(int i=1;i<=n;i++)s+=(i*2L-1)*i;
            System.out.println(s+" "+(n*2));
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<=n;i++)sb.append(i+" ");
            for(int j=n;j>0;j--){
                System.out.println("1 "+j+" "+sb);
                System.out.println("2 "+j+" "+sb);
            }
        }
    }
}
//1 2 3 4
//2 2 3 4
//3 3 3 4
//4 4 4 4