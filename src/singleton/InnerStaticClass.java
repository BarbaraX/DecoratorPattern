package singleton;

public class InnerStaticClass {
	
	private InnerStaticClass() {}
	
	public static InnerStaticClass getInstance() {
		return InnerInstanceHolder.INSTANCE;
	}
	
	private static class InnerInstanceHolder {
		static InnerStaticClass INSTANCE = new InnerStaticClass();
	}

}
