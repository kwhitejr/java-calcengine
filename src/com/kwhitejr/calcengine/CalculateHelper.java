package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/17/17.
 */
public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double dLeftVal;
    double dRightVal;
    double dResult;

    public void process(String statement) throws InvalidStatementException {
        String[] parts = statement.split(" ");
        if (parts.length != 3) {
            throw new InvalidStatementException("Incorrect number of fields.", statement);
        }

        String commandString = parts[0];

        try {
            dLeftVal = Double.parseDouble(parts[1]);
            dRightVal = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data.", statement, e);
        }

        setCommandFromString(commandString);
        if (command == null) {
            throw new InvalidStatementException("Invalid command (not enumerated).", statement);
        }

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

    @Override
    public String toString() {
        char symbol = ' ';
        switch(command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(dLeftVal);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append(dRightVal);
        sb.append(" = ");
        sb.append(dResult);

        return sb.toString();
    }
}
