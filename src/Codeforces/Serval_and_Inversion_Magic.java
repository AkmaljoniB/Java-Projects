package Codeforces;

import java.util.Scanner;

public class Serval_and_Inversion_Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0,l=0;
            String s=sc.next(),p="Yes";
            for (int i=0;i<n-n/2;i++) {
                if (!s.substring(i,i+1).equals(s.substring(s.length()-1-i,s.length()-i))){
                    if (l!=0){
                        p="No";
                        break;
                    }
                    k++;
                }else if (k!=0)l++;
            }
            System.out.println(p);
        }
    }
}
