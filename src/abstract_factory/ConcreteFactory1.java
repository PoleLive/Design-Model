package abstract_factory;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new Product1A();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new Product1B();
	}

}
