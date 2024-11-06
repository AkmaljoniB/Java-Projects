package Codeforces;

import java.util.Scanner;

public class Little_Elephant_and_Rozdol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,k=0,o=0;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if (min>a){
                min=a;
                o=i;
                k=0;
            }else if (min==a)k++;
        }
        System.out.println(k==0?o+1:"Still Rozdil");
    }
}