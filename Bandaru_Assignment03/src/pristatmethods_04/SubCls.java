package pristatmethods_04;

public class SubCls extends SuprCls {
	
	void display() // trying to override display() {
    System.out.println("Sub class");
 }

public static void main(String[] args) {
    SuprCls obj = new SubCls();
    obj.display();
 }

}

/* Output
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method display() from the type SuprCls is not visible

	at pristatmethods_04.SubCls.main(SubCls.java:11)
 */
