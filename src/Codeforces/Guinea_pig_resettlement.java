package Codeforces;

import java.util.Scanner;

public class Guinea_pig_resettlement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0,p=0,l=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a==1)l++;
                else{
                    int q=k!=0?k-p/2-1:0;
                    if (k<l||q<l)k+=l-q;
                    p+=l;
                    l=0;
                }
            }
            int q=k!=0?k-p/2-1:0;
            if (k<l||q<l)k+=l-q;
            System.out.println(k);
        }
    }
}
