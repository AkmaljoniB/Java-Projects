package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Berland_selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String[]arr=sc.nextLine().split(" ");
            Map<String, List<Long>>map=new HashMap<>();
            long s=0;
            for (int i=0;i<n;i++){
                if (!map.containsKey(arr[i]))map.put(arr[i],new ArrayList<>());
                long a=sc.nextInt();
                map.get(arr[i]).add(a);
                s+=a;
            }
            for (Map.Entry<String,List<Long>>entry:map.entrySet()) {
                Collections.sort(entry.getValue());
                for (int i=1;i<entry.getValue().size();i++)entry.getValue().set(i,entry.getValue().get(i-1)+entry.getValue().get(i));
            }
            for (int i=1;i<=n;i++) {
                long p = s;
                for (Map.Entry<String,List<Long>>entry:map.entrySet()) {
                    if (entry.getValue().size()%i!=0) p-=entry.getValue().get(entry.getValue().size()%i-1);
                }
                pr.print(p+" ");
            }
            pr.println();
        }
        pr.close();
    }
}
