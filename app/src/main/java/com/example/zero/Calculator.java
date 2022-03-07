package com.example.zero;
import com.fathzer.soft.javaluator.DoubleEvaluator;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Calculator {

    String expression;

    public Calculator() {
            expression = "";
    }

    public void append(String s)
    {
        expression += s;
    }


    public double getResult()
    {
        Double result = new DoubleEvaluator().evaluate(expression);

        return result;
    }

}
