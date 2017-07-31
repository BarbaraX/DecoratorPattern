package singleton;

/**
 * Use static member to insure that the INSTANCE is created when JVM is loading the class
 * It's easy to implement, and suitable for small object.
 * 
 * @author xiongzhanyun
 *
 */

public class Hunger {
	private static Hunger instance = new Hunger();
	
	/*make the constructor private*/
	private Hunger() {}
	
	public static Hunger getInstance() {
		return instance;
	}

}
