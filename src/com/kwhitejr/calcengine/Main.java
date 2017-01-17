package com.kwhitejr.calcengine;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "divide 100.0 50.0",
                "add 100.0 50.0",
                "multiply 100.0 50.0",
                "subtract 100.0 50.0",
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement:statements) {
            helper.process(statement);
            System.out.println(helper);
        }
    }

    static void useMathEquation() {

        // Using MathEquation(s)
	    MathEquation[] equations = new MathEquation[4];
	    equations[0] = new MathEquation('d', 100.0d, 50.0d);
	    equations[1] = new MathEquation('a', 25.0d, 92.0d);
	    equations[2] = new MathEquation('s', 225.0d, 17.0d);
	    equations[3] = new MathEquation('m', 100.0d, 50.0d);

	    for (MathEquation equation : equations) {
	        equation.execute();
	        System.out.print("Result: ");
	        System.out.println(equation.getdResult());
        }

        System.out.println();
        System.out.println("Using overloads");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);

        System.out.println("Result: ");
        System.out.println(equationOverload.getdResult());

        CalculateBase[] calculators = {
                new Adder(25.0d, 92.0d),
                new Subtracter(2.0d, 9.0d),
                new Multiplier(2.0d, 9.0d),
                new Divider(2.0d, 9.0d),
        };

        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("Result: ");
            System.out.println(calculator.getdResult());
        }

    }

}
