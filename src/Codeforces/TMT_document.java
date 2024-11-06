package Codeforces;

import java.util.Scanner;

public class TMT_document {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            String s=sc.next(),p="YES";
            int l=(s.length()-s.replace("T","").length())/2;
            for (int i=0;i<n;i++){
                if (s.charAt(i)=='T'){
                    k++;
                    if (k>l){
                        p="NO";
                        break;
                    }
                } else {
                    k--;
                    if (k<0){
                        p="NO";
                        break;
                    }
                }
            }
            System.out.println(k==l&&p.equals("YES")? "YES":"NO");
        }
    }
}
