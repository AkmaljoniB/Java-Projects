package Codeforces;

import java.util.Scanner;

public class Nearest_cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[]arr=new int[n],a=new int[n],b=new int[n];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            a[1]=1;
            b[n-2]=1;
            for (int i = 2; i <n; i++) {
                arr[i]=sc.nextInt();
                if (arr[i-1]-arr[i-2]>arr[i]-arr[i-1])a[i]+=a[i-1]+1;
                else a[i]+=a[i-1]+arr[i]-arr[i-1];
            }
            for (int i = n-3;i>=0;i--) {
                if (arr[i+2]-arr[i+1]>arr[i+1]-arr[i])b[i]+=b[i+1]+1;
                else b[i]+=b[i+1]+arr[i+1]-arr[i];
            }
            int m=sc.nextInt();
            for (int i=0;i<m;i++) {
                int x=sc.nextInt(),y=sc.nextInt();
                if (x<y) System.out.println(a[y-1]-a[x-1]);
                else System.out.println(b[y-1]-b[x-1]);
            }
        }
    }
}
