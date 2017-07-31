/**
 * adapt a class or an interface to another type.
 * the old type delegates the new type, and do the actual work.
 * 
 * @author xiongzhanyun
 *
 */
public class AdapterPattern {
	
	interface ClientInterface {
		void op1();
	}
	
	class Adapter implements ClientInterface{
		Adaptee mAdaptee;
		
		public Adapter(Adaptee adaptee) {
			this.mAdaptee = adaptee;
		}

		@Override
		public void op1() {
			//reuse method in Adaptee
			mAdaptee.a();
		}
	}
	
	class Adaptee {
		void a() {
			//a reused method
		}
	}

}
