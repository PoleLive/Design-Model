package ch1.calcutelator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				String line = sc.nextLine();
				double number1 = Double.valueOf(line.split(" ")[0]);
				double number2 = Double.valueOf(line.split(" ")[2]);
				String op = line.split(" ")[1];
				Operator operator = null;
				switch(op){
				case "+":
					operator = new AddOperation();
					break;
				case "-":
					operator = new Sub();
					break;
				case "*":
					operator = new Mul();
					break;
				case "/":
					operator = new Divide();
					break;
				}
				try {
					double ans = Operation.GetResult(number1, number2, operator );
					System.out.println(ans);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("输入的格式错误");
				}
			}
	}

}
