package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/19/17.
 */
public class PowerOf implements MathProcessing {

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double dLeftVal, double dRightVal) {
        return Math.pow(dLeftVal, dRightVal);
    }
}
