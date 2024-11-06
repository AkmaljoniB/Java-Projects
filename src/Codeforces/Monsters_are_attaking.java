package Codeforces;

import java.util.*;
public class Monsters_are_attaking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            long s=0;
            String p="YES";
            int[][]arr=new int[n+1][2];
            for (int i=1;i<=n;i++)arr[i][0]=sc.nextInt();
            for (int i=1;i<=n;i++)arr[i][1]=Math.abs(sc.nextInt());
            Arrays.sort(arr, Comparator.comparingInt(a->a[1]));
            for (int i=1;i<=n; i++) {
                s+= (long) (arr[i][1]-arr[i - 1][1]) *k;
                s-=arr[i][0];
                if (s<0){
                    p="NO";
                    break;
                }
            }
            System.out.println(p);
        }
    }
}
