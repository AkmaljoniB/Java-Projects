package Task;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i>0; i--) {
            list.add(i);
        }
            System.out.println(list);
    }
}
