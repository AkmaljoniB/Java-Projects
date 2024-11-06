package Codeforces;

import java.util.Scanner;

public class Bridge_destruction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            System.out.println(k>=n-1?1:n);
        }
    }
}
//1 2
//1 3
//1 4
//2 3
//2 4
//3 4