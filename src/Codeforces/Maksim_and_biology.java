package Codeforces;

import java.util.Scanner;

public class Maksim_and_biology{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=104;
        String s=sc.next();
        for(int i=3;i<n;i++){
            int sum=Math.min(s.charAt(i-3)-'A','Z'-s.charAt(i-3)+1);
            sum+=Math.min(Math.max(s.charAt(i-2)-'C','C'-s.charAt(i-2)),'Z'-s.charAt(i-2)+3);
            sum+=Math.min(Math.max(s.charAt(i-1)-'T','T'-s.charAt(i-1)),s.charAt(i-1)-'A'+7);
            sum+=Math.min(Math.max(s.charAt(i)-'G','G'-s.charAt(i)),'Z'-s.charAt(i)+7);
            min=Math.min(min,sum);
        }
        System.out.println(min);
    }
}