package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/16/17.
 */
public class Subtracter extends CalculateBase {
    public Subtracter() {}
    public Subtracter(double dLeftVal, double dRightVal) {
        super(dLeftVal, dRightVal);
    }

    @Override
    public void calculate() {
        double value = getdLeftVal() - getdRightVal();
        setdResult(value);
    }
}
