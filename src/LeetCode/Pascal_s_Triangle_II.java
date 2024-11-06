package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_s_Triangle_II{
    public List<Integer>getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer>a=new ArrayList<>();
            a.add(1);
            if(i>1){
                for(int j=0;j<i-1;j++)a.add(list.get(a.size()-1)+list.get(a.size()));
            }
            if(i>0)a.add(1);
            list=a;
        }
        return list;
    }
}