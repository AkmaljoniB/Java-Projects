package Alexeev;

import java.util.*;

public class Alexeev_0093{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]a=new String[n];
        int[]arr=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.next();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            String s=sc.next();
            for (int j=0;j<n;j++) {
                if (s.length()==a[j].length()&&!s.equals(a[j])){
                    for(int l=0;l<a[j].length();l++) {
                        if ((s.substring(0,l)+s.substring(l+1)).equals(a[j].substring(0,l)+a[j].substring(l+1))){
                            arr[j]++;
                            break;
                        }
                    }
                }
            }
        }
        for (int i=0;i<n;i++) System.out.println(arr[i]);
    }
}
