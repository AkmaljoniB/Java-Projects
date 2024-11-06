package Codeforces;

import java.util.Scanner;

public class Tic_tac_toe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,o=0,p1=0,p2=0;
        String[]ars={sc.next(),sc.next(), sc.next()};
        for(int i=0;i<3;i++){
            if(ars[i].equals("XXX"))p1++;
            else if(ars[i].equals("000"))p2++;
            if(ars[0].charAt(i)=='X'&&ars[1].charAt(i)=='X'&&ars[2].charAt(i)=='X')p1++;
            else if(ars[0].charAt(i)=='0'&&ars[1].charAt(i)=='0'&&ars[2].charAt(i)=='0')p2++;
            x+=3-ars[i].replace("X","").length();
            o+=3-ars[i].replace("0","").length();
        }
        if(ars[0].charAt(0)=='X'&&ars[1].charAt(1)=='X'&&ars[2].charAt(2)=='X')p1++;
        else if(ars[0].charAt(0)=='0'&&ars[1].charAt(1)=='0'&&ars[2].charAt(2)=='0')p2++;

        if(ars[0].charAt(2)=='X'&&ars[1].charAt(1)=='X'&&ars[2].charAt(0)=='X')p1++;
        else if(ars[0].charAt(2)=='0'&&ars[1].charAt(1)=='0'&&ars[2].charAt(0)=='0')p2++;

        if((p1==1&&p2==0&&x-o==1)||(p1==2&&x==5&&o==4))System.out.println("the first player won");
        else if(p2==1&&p1==0&&x==o)System.out.println("the second player won");
        else if(p1>0||p2>0||x-o>1||o>x)System.out.println("illegal");
        else if(x==5&&o==4)System.out.println("draw");
        else if(x>o)System.out.println("second");
        else System.out.println("first");
    }
}