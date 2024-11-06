package Codeforces;

import java.util.Scanner;

public class Vova_and_train {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int L=sc.nextInt(),v=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt(),p=l%v==0?0:v-l%v;
            long s=L/v;
            if (r-r%v>=l &&(l+p)<=r)s-=(r-r%v-(l+p))/v+1;
            System.out.println(s);
        }
    }
}