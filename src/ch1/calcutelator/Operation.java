package ch1.calcutelator;

public abstract class Operation {
	public static double GetResult(double number1, double number2, Operator operator) throws Exception{
		double result = 0;
		result = operator.operate(number1,number2);
		return result;
	}
}
 