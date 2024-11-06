package Codeforces;

import java.util.Scanner;

public class Bazoki_and_Mokki_massif{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),p=a,k=0;
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                if(a>b)k++;
                a=b;
            }
            System.out.println(k>1||(k==1&&a>p)?"No":"Yes");
        }
    }
}