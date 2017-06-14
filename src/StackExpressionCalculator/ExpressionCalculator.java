package StackExpressionCalculator;

import java.util.Stack;

public class ExpressionCalculator {

    private Stack<String> operationsStack;
    private Stack<Double> valuesStack;

    public ExpressionCalculator(){
        this.operationsStack = new Stack<>();
        this.valuesStack = new Stack<>();
    }

    public void calculateExpression(String expression){
        String[] expressionArray = expression.split(" ");

        for(String s: expressionArray){

            if(s.equals("(")){
                // do nothing
            } else if(s.equals("+")){
                this.operationsStack.push(s);
            } else if(s.equals("*")){
                this.operationsStack.push(s);
            } else if(s.equals("-")){
                this.operationsStack.push(s);
            } else if(s.equals("/")){
                this.operationsStack.push(s);
            } else if(s.equals(")")){

                String operation = this.operationsStack.pop();

                if(operation.equals("+")){
                    this.valuesStack.push(this.valuesStack.pop()+this.valuesStack.pop());
                } else if(operation.equals("*")){
                    this.valuesStack.push(this.valuesStack.pop()*this.valuesStack.pop());
                } else if(operation.equals("-")){
                    this.valuesStack.push((this.valuesStack.pop()-this.valuesStack.pop())*(-1));
                } else if(operation.equals("/")){
                    double divisor = this.valuesStack.pop();
                    double dividend = this.valuesStack.pop();
                    this.valuesStack.push(dividend/divisor);
                }
            } else {
                this.valuesStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result(){
        System.out.println(this.valuesStack.pop());
    }
}
