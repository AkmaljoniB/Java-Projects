package Codingbat.String_2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if (a.length()<b.length()){
            if (b.substring(b.length()-a.length()).equalsIgnoreCase(a)){
                return true;
            }
            return false;
        }
        if (a.length()>b.length()){
            if (a.substring(a.length()-b.length()).equalsIgnoreCase(b)){
                return true;
            }
            return false;
        }
        if (a.equalsIgnoreCase(b)){
            return true;
        }
        return false;
    }
}
