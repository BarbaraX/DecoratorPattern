import java.util.ArrayList;
import java.util.List;


/**
 * for interactions between objects
 * 
 * @author xiongzhanyun
 *
 */
public class ObserverPattern {
	
	abstract class Observer {
		abstract void onNotified(Subject subject);
	}
	
	abstract class Subject {
		List<Observer> observers = new ArrayList<Observer>();
		
		//makes it final
		public final void register(Observer o) {
			observers.add(o);
		}
		
		//makes it final
		public final void unregister(Observer o) {
			observers.remove(o);
		}
		
		public void notifyObservers() {
			for(Observer o:observers) {
				o.onNotified(this);
			}
		}
	}
	
	class ConcreteObserver extends Observer {

		@Override
		void onNotified(Subject subject) {
			// do action when notified
		}
	}
	
	class ConcreteSubject extends Subject {
		//other method
	}

}
