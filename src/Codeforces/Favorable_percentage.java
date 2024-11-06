package Codeforces;

import java.util.Scanner;

public class Favorable_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println(a<b?Math.max(a-(b-a),0):a);
        }
    }
}