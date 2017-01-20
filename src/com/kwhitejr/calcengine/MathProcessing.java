package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/19/17.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double dLeftVal, double dRightVal);
}
