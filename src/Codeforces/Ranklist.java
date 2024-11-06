package Codeforces;

import java.util.*;

public class Ranklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (!map.containsKey(-a)) map.put(-a, new LinkedList<>());
            map.get(-a).add(sc.nextInt());
        }
        for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
            if (k-entry.getValue().size()<=0){
                int l =1;
                Collections.sort(entry.getValue());
                for (int i = k-2;i>=0 ;i--) {
                    if (Objects.equals(entry.getValue().get(k-1), entry.getValue().get(i)))l++;
                    else break;
                }
                for (int i = k;i<entry.getValue().size() ;i++) {
                    if (Objects.equals(entry.getValue().get(k-1), entry.getValue().get(i)))l++;
                    else break;
                }
                System.out.println(l);
                break;
            }
            k-=entry.getValue().size();
        }
    }
}
