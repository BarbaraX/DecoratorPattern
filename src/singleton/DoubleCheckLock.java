package singleton;

public class DoubleCheckLock {
	//volatile
	//more info about <a href="http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization">volatile</a>
	private static volatile DoubleCheckLock instance;
	
	/*make the constructor private*/
	private DoubleCheckLock() {}
	
	public static DoubleCheckLock getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckLock.class) {
				if(instance == null) {
					instance = new DoubleCheckLock();
				}
			}
		}
		return instance;
	}

}
