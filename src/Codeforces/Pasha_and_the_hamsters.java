package Codeforces;

import java.util.*;

public class Pasha_and_the_hamsters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<a;i++)l1.add(sc.nextInt());
        for(int i=1;i<=n;i++){
            if(l1.contains(i))System.out.print("1 ");
            else System.out.print("2 ");
        }
    }
}