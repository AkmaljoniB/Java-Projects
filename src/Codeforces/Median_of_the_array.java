package Codeforces;

import java.util.*;

public class Median_of_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=(n+1)/2,k=1;
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=l;i<n;i++){
                if (arr[i]==arr[l-1])k++;
                else break;
            }
            System.out.println(k);
        }
    }
}
