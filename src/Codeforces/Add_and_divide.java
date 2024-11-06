package Codeforces;

import java.util.Scanner;

public class Add_and_divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),k=0,c=a,min=Integer.MAX_VALUE,i=1;
            if (b==1){
                k++;
                b++;
                i++;
            }
            while (true){
                while (c>0) {
                    k++;
                    c/=b;
                }
                c = a;
                if(min>=k)min=k;
                else break;
                k=i;
                i++;
                b++;
            }
            System.out.println(min);
        }
    }
}