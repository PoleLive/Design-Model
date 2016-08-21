package factory_method;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new ProductAFactory();
		Product product = factory.createProduct();
		System.out.println(product.getClass().getName());
	}

}
