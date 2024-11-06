package Codingbat.Ap_1;

import java.util.Arrays;

public class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        String a[] = new String[2];
        a[0]= aName;
        a[1]= bName;
        Arrays.sort(a);
        if (a[0].equals(aName) && aId<bId){
            return -1;
        }
        if (a[0].equals(bName) && bId<aId){
            return 1;
        }
        if (aId<bId){
            return 1;
        }
        return 0;
    }
}