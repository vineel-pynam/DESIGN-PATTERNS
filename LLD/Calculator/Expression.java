public class Expression implements ArithmeticExpression{

    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private Operation operation;

    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart, Operation operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }

    @Override
    public int evaluate(){
        int value = 0;
        switch(operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUB:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIV:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        return value;
    }
}