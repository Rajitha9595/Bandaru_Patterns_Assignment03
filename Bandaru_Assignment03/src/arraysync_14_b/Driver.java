package arraysync_14_b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//Using CopyOnWriteArrayList.

public class Driver {

	 public static void main (String[] args)
	    {
	        // creating a thread-safe Arraylist.
	        CopyOnWriteArrayList<String> threadSafeList
	            = new CopyOnWriteArrayList<String>();
	 
	        // Adding elements to synchronized ArrayList
	        threadSafeList.add("java");
	        threadSafeList.add("code");
	        threadSafeList.add("practice");
	 
	        System.out.println("Elements of synchronized ArrayList :");
	 
	        // Iterating on the synchronized ArrayList using iterator.
	        Iterator<String> it = threadSafeList.iterator();
	 
	        while (it.hasNext())
	            System.out.println(it.next());
	    }
	}