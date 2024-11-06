package Codeforces;

import java.util.Scanner;
public class Suspension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),l=0,p=0;
            int[][]arr=new int[n][n-1];
            for(int i=0;i<n;i++)for(int j=0;j<n-1;j++)arr[i][j]=sc.nextInt();
            for (int i=0;i<n-1;i++){
                if (arr[i][0]!=arr[i+1][0]){
                    l=arr[i][0];
                    p=arr[i+1][0];
                    break;
                }
            }
            if (arr[0][0]==l&&(arr[0][0]==arr[1][0]||arr[0][0]==arr[2][0])) System.out.print(l+" "+p+" ");
            else {
                System.out.print(p+" "+l+" ");p=l;
            }
            for (int i=1;i<n-1;i++){
                for (int j=0;j<n;j++) {
                    if (arr[j][i] != p) {
                        System.out.print(arr[j][i] + " ");
                        p=arr[j][i];
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
