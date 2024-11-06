package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Parcel_collection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[][] arr = new int[n+1][2];
            for(int i = 0; i < n; i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            Arrays.sort(arr,(int[]i,int[]j)->i[0]==j[0]?i[1]-j[1]:i[0]-j[0]);
            String s="YES\n";
            for(int i=1;i<=n;i++) {
                if(arr[i][1] < arr[i-1][1]) {
                    s="NO";
                    break;
                }
                for(int j = 0; j < arr[i][0]-arr[i-1][0]; j++) s=s+"R";
                for(int j = 0; j < arr[i][1]-arr[i-1][1]; j++) s=s+"L";
            }
            System.out.println(s);
        }
    }
}
