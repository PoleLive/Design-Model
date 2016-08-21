package abstract_factory;

public class Client {
	public static void main(String args[]){
		AbstractFactory factory = new ConcreteFactory1();
		ProductA productA = factory.createProductA();
		ProductB productB = factory.createProductB();
		System.out.println(productA.getClass().getName());
		System.out.println(productB.getClass().getName());
	}
}
