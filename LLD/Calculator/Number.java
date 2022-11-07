public class Number implements ArithmeticExpression{
    private int num;
    public Number(int num){
        this.num = num;
    }

    @Override
    public int evaluate(){
        return num;
    }
}