package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/16/17.
 */
public class Adder extends CalculateBase implements MathProcessing{
    public Adder() {}
    public Adder(double dLeftVal, double dRightVal) {
        super(dLeftVal, dRightVal);
    }

    @Override
    public void calculate() {
        double value = getdLeftVal() + getdRightVal();
        setdResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double dLeftVal, double dRightVal) {
        setdLeftVal(dLeftVal);
        setdRightVal(dRightVal);
        calculate();

        return getdResult();
    }
}
