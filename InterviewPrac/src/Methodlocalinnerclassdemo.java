
public class Methodlocalinnerclassdemo {
	
	void outerMehtod() {
		
		int x =20;
	  System.out.println("inside outer method");
	  
	  class Inner{
		   public void innnerMethod() {
			   
		  System.out.println("inside inner class");
		  System.out.println("x is = "+x);
		   }
	  }
	  
	  Inner y =new Inner();
	  y.innnerMethod();
	}
	
}
