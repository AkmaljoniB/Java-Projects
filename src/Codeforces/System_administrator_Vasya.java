package Codeforces;

import java.util.Scanner;

public class System_administrator_Vasya{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p="";
        while(s.contains("@")){
            int l=s.indexOf("@");
            if(l!=0&&l!=s.length()-1&&s.charAt(l+1)!='@'){
                p=p.concat(s.substring(0,l+2)+",");
                s=s.substring(l+2);
            }else{
                p="No";
                break;
            }
        }
        System.out.println(!p.equals("No")&&!p.equals("")?p.substring(0,p.length()-1)+s:"No solution");
    }
}