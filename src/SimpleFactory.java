/**
 * decouple client and creation of interface implementations,
 * client only cares about the use of interface.
 * 
 * @author xiongzhanyun
 *
 */
public class SimpleFactory {
	
	/*Factory method to create product implementation according to param*/
	public Product createProduct(int param) {
		if(param<0) {
			return new ImplProA();
		} 
		return new ImplProB();
	}
	
	public interface Product {/*product interface*/
	}
	
	public static class ImplProA implements Product {/*implementation of product interface*/
	}
	
	public static class ImplProB implements Product {/*implementation of product interface*/
	}

}
