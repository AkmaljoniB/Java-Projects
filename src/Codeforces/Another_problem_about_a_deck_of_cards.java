package Codeforces;

import java.util.*;

public class Another_problem_about_a_deck_of_cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt();
        List<Integer>list=new LinkedList<>();
        for (int i=0;i<n;i++)list.add(sc.nextInt());
        for (int i=0;i<q;i++){
            int t=sc.nextInt(),in=list.indexOf(t);
            System.out.print((in+1)+" ");
            list.remove(in);
            list.add(0,t);
        }
    }
}