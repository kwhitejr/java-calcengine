package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/16/17.
 */
public abstract class CalculateBase {
    private double dLeftVal;
    private double dRightVal;
    private char cOpCode = 'a';
    private double dResult;

    // getters
    public double getdLeftVal () { return dLeftVal; }
    public double getdRightVal () { return dRightVal; }
    public double getdResult () { return dResult; }

    // setters
    public void setdLeftVal(double dLeftVal) { this.dLeftVal = dLeftVal; }
    public void setdRightVal(double dRightVal) { this.dRightVal = dRightVal; }
    public void setdResult(double dResult) { this.dResult = dResult; }

    // constructors
    public CalculateBase() { }
    public CalculateBase(double dLeftVal, double dRightVal) {
        this.dLeftVal = dLeftVal;
        this.dRightVal = dRightVal;
    }

    // methods
    public abstract void calculate();
}
