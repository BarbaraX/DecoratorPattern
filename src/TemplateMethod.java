
public class TemplateMethod {
	
	abstract class AbstractClass {
		
		//template method, which defines the template
		public void templateMethod() {
			doOp1();//sub ops
			doOp2();//sub ops
		}
		
		//sub ops, defer the implementation to subClass
		abstract void doOp1();
		abstract void doOp2();
	}
	
	class ConcreteClass extends AbstractClass {

		@Override
		void doOp1() {
			// concrete class decide the implementation of doOp1
		}

		@Override
		void doOp2() {
			// concrete class decide the implementation of doOp2			
		}
		
	}

}
