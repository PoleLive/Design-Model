package ch1.calcutelator;

public class Divide implements Operator {

	@Override
	public double operate(double number1, double number2) throws Exception{
		// TODO Auto-generated method stub
		double ans;
		
		ans = number1 / number2;
		
		return ans;
	}

}
