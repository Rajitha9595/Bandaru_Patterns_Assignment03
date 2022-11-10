package thread_18;

public class Driver extends Thread {

	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 Driver t1=new Driver();  
		  t1.start();  
		  t1.start();  
		 }  
		}  

/*Output
 * Exception in thread "main" running...
java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:789)
	at thread_18.Driver.main(Driver.java:11)

 * 
 * 
 * */
