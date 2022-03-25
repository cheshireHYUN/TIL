package Chapter10;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		findClass("java.lang.String");
	}
	
	private static void findClass(String className) throws ClassNotFoundException {
		Class.forName(className);
	}

}
