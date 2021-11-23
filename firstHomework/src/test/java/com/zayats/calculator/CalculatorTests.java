package com.zayats.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testSumNumbersShouldSumWhenNumbersPositive(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 6;

        //when
        int testResult = testCalculator.sumNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(11,testResult);
    }

    @Test
    public void testSumNumbersShouldSumWhenNumbersNegative(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -4;
        int secondNumber = -9;

        //when
        int testResult = testCalculator.sumNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(-13,testResult);
    }

    @Test
    public void testSumNumbersShouldSumWhenNumbersOpposite(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -5;
        int secondNumber = 1;

        //when
        int testResult = testCalculator.sumNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(-4,testResult);
    }

    @Test
    public void testSubtractNumbersShouldSubWhenNumbersPositive(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = 4;
        int secondNumber = 3;

        //when
        int testResult = testCalculator.subtractNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(1,testResult);
    }

    @Test
    public void testSubtractNumbersShouldSubWhenNumbersNegative(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -4;
        int secondNumber = -3;

        //when
        int testResult = testCalculator.subtractNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(-1,testResult);
    }

    @Test
    public void testSubtractNumbersShouldSubWhenNumbersOpposite(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -4;
        int secondNumber = 3;

        //when
        int testResult = testCalculator.subtractNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(-7,testResult);
    }

    @Test
    public void testMultiplyNumbersShouldMultiWhenNumbersPositive(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = 4;
        int secondNumber = 3;

        //when
        int testResult = testCalculator.multiplyNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(12,testResult);
    }

    @Test
    public void testMultiplyNumbersShouldMultiWhenNumbersNegative(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -2;
        int secondNumber = -3;

        //when
        int testResult = testCalculator.multiplyNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(6,testResult);
    }

    @Test
    public void testMultiplyNumbersShouldMultiWhenNumbersOpposite(){
        //given
        Calculator testCalculator = new Calculator();
        int firstNumber = -4;
        int secondNumber = 3;

        //when
        int testResult = testCalculator.multiplyNumbers(firstNumber, secondNumber);

        //then
        Assert.assertEquals(-12,testResult);
    }

    @Test
    public void testDivideNumbersShouldDivWhenNumbersPositive(){
        //given
        Calculator testCalculator = new Calculator();
        double firstNumber = 6;
        double secondNumber = 3;

        //when
        double testResult = testCalculator.divideNumbers(firstNumber, secondNumber);

        //then
        double assertDelta = 0.1;
        Assert.assertEquals(2,testResult, assertDelta);
    }
    @Test
    public void testDivideNumbersShouldDivWhenNumbersNegative(){
        //given
        Calculator testCalculator = new Calculator();
        double firstNumber = -6;
        double secondNumber = -3;

        //when
        double testResult = testCalculator.divideNumbers(firstNumber, secondNumber);

        //then
        double assertDelta = 0.1;
        Assert.assertEquals(2,testResult, assertDelta);
    }
    @Test
    public void testDivideNumbersShouldDivWhenNumbersOpposite(){
        //given
        Calculator testCalculator = new Calculator();
        double firstNumber = -7;
        double secondNumber = 3;

        //when
        double testResult = testCalculator.divideNumbers(firstNumber, secondNumber);

        //then
        double assertDelta = 0.1;
        Assert.assertEquals(-2.3,testResult, assertDelta);
    }
}
