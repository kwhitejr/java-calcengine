package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/2/17.
 */
public class MathEquation {
    private double dLeftVal;
    private double dRightVal;
    private char cOpCode = 'a';
    private double dResult;

    // getters
    public double getdLeftVal () { return dLeftVal; }
    public double getdRightVal () { return dRightVal; }
    public double getcOpCode () { return cOpCode; }
    public double getdResult () { return dResult; }

    // setters
    public void setdLeftVal(double dLeftVal) { this.dLeftVal = dLeftVal; }
    public void setdRightVal(double dRightVal) { this.dRightVal = dRightVal; }
    public void setcOpCode(char cOpCode) { this.cOpCode = cOpCode; }

    // initialization block
    {
        // code here
    }

    // constructors
    public MathEquation() {}

    public MathEquation(char cOpCode) {
        this.cOpCode = cOpCode;
    }

    public MathEquation(char cOpCode, double dLeftVal, double dRightVal) {
        this(cOpCode);
        this.dLeftVal = dLeftVal;
        this.dRightVal = dRightVal;
    }

    // methods
    public void execute(double dLeftVal, double dRightVal) {
        this.dLeftVal = dLeftVal;
        this.dRightVal = dRightVal;

        execute();
    }

    public void execute() {
        switch (cOpCode) {
            case 'a':
                dResult = dLeftVal + dRightVal;
                break;
            case 's':
                dResult = dLeftVal - dRightVal;
                break;
            case 'm':
                dResult = dLeftVal * dRightVal;
                break;
            case 'd':
                dResult = dRightVal != 0 ? dLeftVal / dRightVal : 0.0d;
                break;
            default:
                System.out.println("Error - Invalid OpCode");
                dResult = 0.0d;
                break;
        }
    }
}
