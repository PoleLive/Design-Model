package simple_factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleFactory {
	public static String classStr = "simple_factory.ProductA";
	public static AbstractProduct getProduct(){
		AbstractProduct product = null;
		try {
			product = (AbstractProduct) Class.forName(classStr).newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	public static AbstractProduct getProduct(Object ...arg){
		AbstractProduct product = null;
		try {
			Class<?> cl = Class.forName(classStr);
			Constructor[] constructors = cl.getConstructors();
			
			for(int i = 0; i < constructors.length; i++){
				Class[] fields = constructors[i].getParameterTypes();
				boolean flag = true;
				if(arg.length != fields.length) continue;
				for(int j = 0; j < fields.length; j++){
					if(fields[j].isInstance(arg[j]) == false)
						flag = false;
				}
				if(flag){
					product = (AbstractProduct) constructors[i].newInstance(arg);
					return product;
				}
					
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
