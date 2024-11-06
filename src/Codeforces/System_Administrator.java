package Codeforces;

import java.util.Scanner;

public class System_Administrator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l1=0,l2=0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()==1)l1+=sc.nextInt()-sc.nextInt();
            else l2+=sc.nextInt()-sc.nextInt();
        }
        System.out.println(l1>=0?"LIVE":"DEAD");
        System.out.println(l2>=0?"LIVE":"DEAD");
    }
}
