package Codeforces;

import java.util.*;

public class Connecting_districts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, List<Integer>>map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (!map.containsKey(arr[i]))map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i+1);
            }
            if (map.size()==1) System.out.println("No");
            else {
                System.out.println("YES");
                int k=0;
                out:for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                    if (entry.getKey() != arr[0]) {
                        for (int j = 0; j < entry.getValue().size(); j++) {
                            System.out.print(map.get(arr[0]).get(0) + " " + entry.getValue().get(j) + "\n");
                            k++;
                            if (k==n-1)break out;
                        }
                    }
                }
                if (k!=n-1) {
                    out:for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                        if (entry.getKey() != arr[0]) {
                            for (int j = 1; j < map.get(arr[0]).size(); j++) {
                                System.out.print(entry.getValue().get(0) + " " + map.get(arr[0]).get(j) + "\n");
                                k++;
                                if (k==n-1)break out;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}