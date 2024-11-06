package Codeforces;

import java.util.Scanner;

public class Nikita_and_line{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')l++;
            else{
                int q=0,w=0,j=i;
                for(;j<s.length();j++){
                    if(s.charAt(j)=='a')q++;
                    else w++;
                    if(w<q)break;
                    max=Math.max(max,l+w+s.substring(j).replace("b","").length());
                }
                l+=q;
                i=j;
            }
        }
        System.out.println(Math.max(max,l));
    }
}