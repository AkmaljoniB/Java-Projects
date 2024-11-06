package Alexeev;

import java.util.Scanner;

public class Alexeev_0114 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        long res=0;
        String p ="1";
        for (int i = 1; i <n ; i++)p=p.concat("0");
        int i=Integer.parseInt(p,k);
        int q=Integer.parseInt(p+"0",k);
        for (;i<q;i++){
            String s = Integer.toString(i,k);
            if (!s.contains("00")&&s.length()==n)res++;
        }
        System.out.println(res);
    }
}
