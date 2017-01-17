package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/17/17.
 */
public class CalculateHelper {
    MathCommand command;
    double dLeftVal;
    double dRightVal;
    double dResult;

    public void process(String statement) {
        String[] parts = statement.split(" ");
        String commandString = parts[0];
        dLeftVal = Double.parseDouble(parts[1]);
        dRightVal = Double.parseDouble(parts[2]);

        setCommandFromString(commandString);

        CalculateBase calculator = null;

        switch (command) {
            case Add:
                calculator = new Adder(dLeftVal, dRightVal);
                break;
            case Subtract:
                calculator = new Subtracter(dLeftVal, dRightVal);
                break;
            case Multiply:
                calculator = new Multiplier(dLeftVal, dRightVal);
                break;
            case Divide:
                calculator = new Divider(dLeftVal, dRightVal);
                break;
        }

        calculator.calculate();
        dResult = calculator.getdResult();
    }

    private void setCommandFromString(String commandString) {
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
            command = MathCommand.Add;
        } else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())) {
            command = MathCommand.Subtract;
        } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
            command = MathCommand.Multiply;
        } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
            command = MathCommand.Divide;
        }
    }
}
