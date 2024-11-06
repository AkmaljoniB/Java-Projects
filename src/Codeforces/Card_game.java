package Codeforces;

import java.util.*;

public class Card_game {
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            sc.nextLine();
            String[]ars=sc.nextLine().split(" ");
            List<String>C=new ArrayList<>(),D=new ArrayList<>(),H=new ArrayList<>(),S=new ArrayList<>();
            Arrays.sort(ars);
            for (int i=0;i<n*2;i++) {
                if (ars[i].charAt(1)=='C')C.add(ars[i]);
                else if (ars[i].charAt(1)=='D')D.add(ars[i]);
                else if (ars[i].charAt(1)=='H')H.add(ars[i]);
                else S.add(ars[i]);
            }
            if (!s.equals("C"))a(C,1);
            if (!s.equals("D"))a(D,1);
            if (!s.equals("H"))a(H,1);
            if (!s.equals("S"))a(S,1);
            if (s.equals("C")){
                b(D,C);
                b(H,C);
                b(S,C);
                a(C,0);
            }
            if (s.equals("D")){
                b(C,D);
                b(H,D);
                b(S,D);
                a(D,0);
            }
            if (s.equals("H")){
                b(C,H);
                b(D,H);
                b(S,H);
                a(H,0);
            }
            if (s.equals("S")){
                b(C,S);
                b(D,S);
                b(H,S);
                a(S,0);
            }
            System.out.print(sb);
            sb=new StringBuilder();
        }
    }
    public static void a(List<String> list,int p){
        while (list.size()>p){
            sb.append(list.get(0)+" "+list.get(1)+"\n");
            list.remove(0);
            list.remove(0);
        }
    }
    public static void b(List<String> list,List<String>list1){
        while (list.size()>0){
            if (list1.size()==0){
                sb= new StringBuilder("IMPOSSIBLE"+"\n");
                break;
            }
            sb.append(list.get(0)+" "+list1.get(0)+"\n");
            list.remove(0);
            list1.remove(0);
        }
    }
}