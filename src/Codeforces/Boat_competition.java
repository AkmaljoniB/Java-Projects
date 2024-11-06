package Codeforces;

import java.util.*;

public class Boat_competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
            List<Integer>arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
                for (int j = 0; j < i; j++) {
                    int a = arr.get(i) + arr.get(j);
                    if (!map.containsKey(a)) map.put(a, new ArrayList<>());
                    map.get(a).add(arr.get(i));
                    map.get(a).add(arr.get(j));
                }
            }
            int max= 0;
            for (Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet()){
                List<Integer>list=new ArrayList<>(arr);
                int k = 0;
                for (int i = 0 ; i < entry.getValue().size();i+=2){
                    int l =0;
                    if (list.contains(entry.getValue().get(i))){
                        list.remove(entry.getValue().get(i));
                        l++;
                    }
                    if (list.contains(entry.getValue().get(i+1))){
                        list.remove(entry.getValue().get(i+1));
                        if (l==1)k++;
                    }
                }
                max = Math.max(max,k);
            }
            System.out.println(max);
        }
    }
}
