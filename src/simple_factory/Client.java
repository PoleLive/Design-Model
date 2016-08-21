package simple_factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "A";
		AbstractProduct product = SimpleFactory.getProduct("A");
		
		System.out.println(product.getClass().getName());
	}

}
