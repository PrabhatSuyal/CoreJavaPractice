package Singleton;

public class SingletonEG1 {

	public static void main(String[] args) {

		System.out.println("SingletonEG1_EagerInitialization : "+SingletonEG1_EagerInitialization.getInstance().toString());
		System.out.println("SingletonEG1_EagerStaticBlock : "+SingletonEG1_EagerStaticBlock.instance.toString());
		System.out.println("SingletonEG1_LazyInitialization : "+SingletonEG1_LazyInitialization.getInstance().toString());
		System.out.println("SingletonEG1_ThreadSafeSingleton : "+SingletonEG1_ThreadSafeSingleton.getInstance().toString());
		System.out.println("SingletonEG1_ThreadSafeSingletonDoubleCheck : "+SingletonEG1_ThreadSafeSingletonDoubleCheck.getInstance().toString());
		System.out.println("SingletonEG1_BillPughSingleton : "+SingletonEG1_BillPughSingleton.getInstance().getClass());
		
	}
}

class SingletonEG1_EagerInitialization{
	private static final SingletonEG1_EagerInitialization instance = new SingletonEG1_EagerInitialization();
	private SingletonEG1_EagerInitialization() {		
	}
	public static SingletonEG1_EagerInitialization getInstance() {
		return instance;
	}
}

class SingletonEG1_EagerStaticBlock{
	public static SingletonEG1_EagerStaticBlock instance;
	private SingletonEG1_EagerStaticBlock() {		
	}
	static{
		instance = new SingletonEG1_EagerStaticBlock() ;
	}
}

class SingletonEG1_LazyInitialization {
	private static SingletonEG1_LazyInitialization instance ;
	private SingletonEG1_LazyInitialization() {		
	}
	public static SingletonEG1_LazyInitialization getInstance() {
		if(instance == null) {
			instance = new SingletonEG1_LazyInitialization();
		}
		return instance;
	}
}

class SingletonEG1_ThreadSafeSingleton{
	private static SingletonEG1_ThreadSafeSingleton instance;
	private SingletonEG1_ThreadSafeSingleton(){
	}
	public synchronized static SingletonEG1_ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new SingletonEG1_ThreadSafeSingleton();
		}
		return instance;
	}
}

class SingletonEG1_ThreadSafeSingletonDoubleCheck{
	private static SingletonEG1_ThreadSafeSingletonDoubleCheck instance;
	private SingletonEG1_ThreadSafeSingletonDoubleCheck() {		
	}
	public static SingletonEG1_ThreadSafeSingletonDoubleCheck getInstance() {
		if(instance == null) {
			synchronized (SingletonEG1_ThreadSafeSingletonDoubleCheck.class) {
				if(instance == null) {
					instance = new SingletonEG1_ThreadSafeSingletonDoubleCheck();
				}
			}
		}
		return instance;
	}	
}

class SingletonEG1_BillPughSingleton{
	private static SingletonEG1_BillPughSingleton instance;
	private SingletonEG1_BillPughSingleton() {		
	}
	private static class SingletonEG1_BillPughSingletonInner{
		private static final SingletonEG1_BillPughSingleton instance = new SingletonEG1_BillPughSingleton();
	}	
  public static SingletonEG1_BillPughSingleton getInstance()
  {
    return SingletonEG1_BillPughSingletonInner.instance;
  }
}