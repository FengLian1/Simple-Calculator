package com.example.zero;
import com.fathzer.soft.javaluator.DoubleEvaluator;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Calculator {

    public String expression;

    public Calculator() {
            expression = "";
    }

    public String getExpression()
    {
        return expression;
    }

    public void append(String s)
    {
        expression += s;
    }

    public void empty()
    {
        expression = "";
    }

    public void delete()
    {
        expression = expression.substring(0, expression.length() - 1);
    }

    public double getResult()
    {
        Double result = new DoubleEvaluator().evaluate(expression);

        return result;
    }

}
