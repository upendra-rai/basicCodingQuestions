package singleton.pattern;

public class Singleton {
	private static Singleton instance = null;
private String s;
	private Singleton() {
		s="singleton class data";
	}

	synchronized public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		
		System.out.println(Singleton.getInstance());
		
		System.out.println(Singleton.getInstance());
	}

}
