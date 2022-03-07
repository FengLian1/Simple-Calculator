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

    public String getResult()
    {
        Double result = new DoubleEvaluator().evaluate(expression);

        if (result % 1.0 != 0)
            return String.format("%s", result);
        else
            return String.format("%.0f", result);


    }

}
