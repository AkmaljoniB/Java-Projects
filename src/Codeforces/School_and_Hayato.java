package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School_and_Hayato {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer>j=new ArrayList<>(),toq=new ArrayList<>();
            for(int i=0;i<n;i++){
                if (sc.nextInt()%2==0)j.add(i+1);
                else toq.add(i+1);
            }
            if (toq.size()>2) System.out.println("YES\n"+toq.get(0)+" "+toq.get(1)+" "+toq.get(2));
            else if (toq.size()>0 &&j.size()>1) System.out.println("YES\n"+toq.get(0)+" "+j.get(0)+" "+j.get(1));
            else System.out.println("NO");
        }
    }
}
