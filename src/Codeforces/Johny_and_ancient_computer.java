package Codeforces;

import java.util.Scanner;

public class Johny_and_ancient_computer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long a = sc.nextLong(), b = sc.nextLong();
            int k=0;
            while (a<b){
                if (a*8<=b)a*=8;
                else if (a*4<=b)a*=4;
                else if (a*2<=b)a*=2;
                else break;
                k++;
            }
            while (a>b){
                if (a%8==0 &&a/8>=b)a/=8;
                else if (a%4==0 && a/4>=b)a/=4;
                else if (a%2==0 &&a/2>=b)a/=2;
                else break;
                k++;
            }
            System.out.println(a!=b?-1:k);
        }
    }
}