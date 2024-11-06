package Codeforces;

import java.io.*;
import java.util.*;

public class Social_network_hard_version {
    public static void main(String[] args) throws IOException {
        PrintWriter pr =new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]ars = br.readLine().split(" ");
        int n = Integer.parseInt(ars[0]);
        int k = Integer.parseInt(ars[1]);
        ars=br.readLine().split(" ");
        List<Integer> list = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(ars[i]);
            if (!set.contains(a)) {
                set.add(a);
                if (list.size() == k) {
//                    int b = list.removeLast();
//                    set.remove(b);
                }
//                list.addFirst(a);
            }
        }
        pr.println(list.size());
        for (int i = 0 ; i <list.size();i++) pr.print(list.get(i) + " ");
        pr.close();
    }
}
