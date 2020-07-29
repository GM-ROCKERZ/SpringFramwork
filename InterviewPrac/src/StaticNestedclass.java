
public class StaticNestedclass {

	private static void outerMethod() {

		System.out.println("Inside outer method of outer class");
	}

	static class Inner{

		public static void main(String args[]) {

			outerMethod();
			System.out.println("Inside the Inner method");
			

		}
	}
	
}

