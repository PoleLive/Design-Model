package factory_method;

public class ProductAFactory implements IFactory{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
