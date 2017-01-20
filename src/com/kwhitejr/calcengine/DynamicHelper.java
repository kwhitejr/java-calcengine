package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/19/17.
 */
public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];

        MathProcessing theHandler = null;

        for(MathProcessing handler:handlers) {
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
                break;
            }
        }

        double dLeftVal = Double.parseDouble(parts[1]);
        double dRightVal = Double.parseDouble(parts[2]);

        double dResult = theHandler.doCalculation(dLeftVal, dRightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(dLeftVal);
        sb.append(" ");
        sb.append(theHandler.getSymbol());
        sb.append(" ");
        sb.append(dRightVal);
        sb.append(" = ");
        sb.append(dResult);

        return sb.toString();
    }
}
