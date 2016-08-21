package factory_method;

public class ProductBFactory implements IFactory {

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
