package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Too_Min_Too_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[n-1]-arr[0]+arr[n-2]-arr[0]+arr[n-2]-arr[1]+arr[n-1]-arr[1]);
        }
    }
}
//10+3=13
//-3-5 =8
//5+1 =6
//-1-10 =11
//13+11+4+
