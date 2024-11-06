package Codeforces;

import java.util.*;

public class Wonderful_coloring_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),o=1;
            int[][]arr=new int[n][2],num=new int[n][2];
            for (int i=0;i<n;i++) {
                num[i][0]=sc.nextInt();
                num[i][1]=i;
            }
            Arrays.sort(num,Comparator.comparingInt(a->a[0]));
            for (int i=0;i<n;i++) {
                arr[num[i][1]][0]=num[i][0];
                if (i<k || num[i][0]!=num[i-k][0]) {
                    arr[num[i][1]][1] = o;
                    o++;
                    if (o==k+1)o=1;
                }
            }
            for (int i=1;i<o;i++) {
                for (int j=0;j<n;j++) {
                    if (arr[j][1]==i){
                         arr[j][1]=0;
                         break;
                    }
                }
            }
            for (int i=0;i<n;i++)System.out.print(arr[i][1]+" ");
            System.out.println();
        }
    }
}