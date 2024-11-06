package Codingbat.Logic_1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1==6 && noDoubles){
            return die1+1;
        }
        if (die1==die2 && noDoubles){
            return die1+die2+1;
        }
        return die1+die2;
    }
}
