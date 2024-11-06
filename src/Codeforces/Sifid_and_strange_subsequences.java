package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Sifid_and_strange_subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0,max=0,min=Integer.MAX_VALUE;
            Integer[]arr=new Integer[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for (int i=0;i<n;i++){
                if (arr[i]<=0||(arr[i]-max>=arr[i]&&min>=arr[i])){
                    k++;
                    if (i!=0)min=Math.min(min,Math.abs(arr[i]-max));
                    max=arr[i];
                } else break;
            }
            System.out.println(k);
        }
    }
}