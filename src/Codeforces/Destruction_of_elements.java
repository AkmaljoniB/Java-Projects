package Codeforces;

import java.util.Scanner;

public class Destruction_of_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),b=0;
            for (int i=1;i<n;i++)b=sc.nextInt();
            System.out.println(a<b?"YES":"NO");
        }
    }
}
