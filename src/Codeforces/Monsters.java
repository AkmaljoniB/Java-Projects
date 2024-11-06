package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Monsters {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,List<Integer>>map=new TreeMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a%k==0) pr.println(i+1);
                else {
                    if (!map.containsKey(-a%k)) map.put(-a%k, new ArrayList<>());
                    map.get(-a%k).add(i+1);
                }
            }
            for (Map.Entry<Integer,List<Integer>>entry:map.entrySet()){
                for (int i=0;i<entry.getValue().size(); i++) {
                    pr.print(entry.getValue().get(i)+" ");
                }
            }
            pr.println();
        }
        pr.close();
    }
}