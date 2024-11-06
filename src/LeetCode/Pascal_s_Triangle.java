package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_s_Triangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>());
            list.get(i).add(1);
            if(i>1){
                for(int j=0;j<i-1;j++)list.get(i).add(list.get(i-1).get(list.get(i).size()-1)+list.get(i-1).get(list.get(i).size()));
            }
            if(i>0)list.get(i).add(1);
        }
        return list;
    }
}
