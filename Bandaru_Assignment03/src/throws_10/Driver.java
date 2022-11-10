package throws_10;

public class Driver extends SuperCls{

	 public void sampleMethod() {
	      System.out.println("Subclass");
	   }
	   public static void main(String args[]) {
	      Driver obj = new Driver();
	      obj.sampleMethod();
	   }
	}