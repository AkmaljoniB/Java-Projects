package Codingbat.String_2;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        int a =0, b=0;
        for (int i=0;i<str.length();i++){
            if (str.length()-1==i){
                break;
            }
            if (str.substring(i,i+1).equals("*") && i!=0){
                b++;
                if (str.substring(i-1,i).equals(str.substring(i+1,i+2))){
                    a++;
                }
                if (!str.substring(i-1,i).equals(str.substring(i+1,i+2))){
                    return false;
                }
            }
        }
        if (a==b){
            return true;
        }
        return false;
    }
}
