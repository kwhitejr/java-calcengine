package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/16/17.
 */
public class Multiplier extends CalculateBase {
    public Multiplier() {}
    public Multiplier(double dLeftVal, double dRightVal) {
        super(dLeftVal, dRightVal);
    }

    @Override
    public void calculate() {
        double value = getdLeftVal() * getdRightVal();
        setdResult(value);
    }
}
