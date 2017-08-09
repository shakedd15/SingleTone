package SingletonPack;

public class Singleton {
	private static Singleton singleton;
	private Singleton(){
		System.out.println("Calling singleton class...");
	}
	public static Singleton newInstance(){
		if(singleton == null){
			singleton = new Singleton();
			System.out.println("New instance created");
		}
		System.out.println("New instance CALLED");

		return singleton;
	}
}