package Alexeev;

import java.util.Scanner;

public class Alexeev_0543 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),w=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt();
        long s= (long) n *(n-1)/2;
        for (int i = 1;i<=n;i++) {
            if ((p-(s-i)*w)>0&&(p-(s-i)*w)%(w-d)==0 &&(p-(s-i)*w)/(w-d)==i){
                n=i;
                break;
            }
        }
        System.out.println(n);
    }
}
