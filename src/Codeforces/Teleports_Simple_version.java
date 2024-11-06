package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Teleports_Simple_version {
    public static void main(String[] args) {
        PrintWriter pr =new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),c=sc.nextInt();
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt()+i+1;
            Arrays.sort(arr);
            for(int i=0;i<n;i++) {
                if(c-arr[i]<0) {
                    n=i;
                    break;
                }else c-=arr[i];
            }
            pr.println(n);
        }
        pr.close();
    }
}
