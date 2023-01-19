package com.vasavi.app;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorUnitTest {

    CalculatorMaths calculatorMaths = new CalculatorMaths();
    @Test
    public void testAdd(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 6.0;
        double result = calculatorMaths.add(a,b);
        Assert.assertEquals(expectedResult,result,0.00);

    }
    @Test
    public void testSub(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 0.0;
        double result = calculatorMaths.sub(a,b);
        Assert.assertEquals(expectedResult, result,0.00);

    }
    @Test
    public void tesMul(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 9.0;
        double result = calculatorMaths.mul(a,b);
        Assert.assertEquals(expectedResult, result,0.00);
    }

    @Test
    public void testDiv(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 1.0;
        double result = calculatorMaths.div(a,b);
        Assert.assertEquals(expectedResult,result,0.00);
    }
}
