package Codeforces;

import java.util.*;

public class Green_gold_dog_array_and_permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int l = n;
            List<Integer> list = new ArrayList<>();
            Map<Integer,String>map = new HashMap<>();
            int[]arr = new int[n];
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                list.add(a);
                arr[i]=a;
            }
            Collections.sort(list);
            for (int i = 0; i < n; i++) {
                if (map.containsKey(list.get(i))){
                 map.put(list.get(i),map.get(list.get(i))+" "+l);
                } else {
                    map.put(list.get(i), String.valueOf(l));
                }
                l--;
            }
            for (int i = 0;i<n;i++){
                String s = map.get(arr[i]);
                if (s.contains(" ")){
                    System.out.print(s.substring(0,s.indexOf(" "))+" ");
                    map.put(arr[i],s.substring(s.indexOf(" ")+1));
                } else {
                    System.out.print(s+" ");
                }
            }
            System.out.println();
        }
    }
}
