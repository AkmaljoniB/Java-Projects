package Codeforces;

import java.util.*;
public class Rock_Paper_Scissors{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]a ={"F","M","S"};
        int l1=0,l2=0,l3=0;
        List<String>list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(sc.next());
            if(list.get(i).equals("rock"))l1++;
            else if (list.get(i).equals("paper"))l2++;
            else l3++;
        }
        String s="?";
        if(l3==2&&l1==1) s=a[list.indexOf("rock")];
        if(l2==2&&l3==1) s=a[list.indexOf("scissors")];
        if(l1==2&&l2==1) s=a[list.indexOf("paper")];
        System.out.println(s);
    }
}