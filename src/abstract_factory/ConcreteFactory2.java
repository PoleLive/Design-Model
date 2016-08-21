package abstract_factory;

public class ConcreteFactory2 extends AbstractFactory{

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new Product2A();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new Product2B();
	}

}
