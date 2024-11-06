package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        String s=sc.next();
        int[]arr=new int[k];
        for(int i=0;i<n;i++){
            if (s.charAt(i)-'A'<k)arr[s.charAt(i)-'A']++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*k);
    }
}