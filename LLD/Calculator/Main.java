class Main{
    public static void main(String args[]){

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression three = new Number(3);

        ArithmeticExpression add = new Expression(one, seven, Operation.ADD);
        ArithmeticExpression parentExpression = new Expression(three, add, Operation.MULTIPLY);

        System.out.print(parentExpression.evaluate());
    }
}