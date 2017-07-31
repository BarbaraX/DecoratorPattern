/**
 * Factory class wants to rely on object of a interface or abstract class,
 * but can't decide which implementation to use.
 * So, the factory class defers the generation of the relied class in its subclasses.
 * 
 * It's been widely used in abstraction of base classes
 * 
 * @author xiongzhanyun
 *
 */
public class FactoryMethod {
	
	//product interface
	static interface Product {
		void method();
	}
	
	//implementation of product interface
	static class ConcreteProduct implements Product{
		public void method(){}
	}
	
	
	//factory of product, who usually uses product in its other method, but yet not sure which product to use
	abstract static class Factory {
		public void doSomething() {/*method who use create product and use its method*/
			this.getProduct().method();
		}
		
		protected abstract Product getProduct();/*let the sub class to offer the actual product*/
	}
	
	//implementation of the factory, who offers the actual product implementation
	static class ConcreteFactory extends Factory {
		public Product getProduct() {
			return new ConcreteProduct();
		}
	}
	

}
