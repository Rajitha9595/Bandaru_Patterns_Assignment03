package hash_15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Driver {

	 public static void main(String args[])
	    {
	        //----------hashtable -------------------------
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	        ht.put(101,"Sharat");
	        ht.put(101,"Goma");
	        ht.put(102,"Dudu");
	        ht.put(103,"Bear");
	        System.out.println("-------------Hash table--------------");
	        for (Map.Entry m:ht.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	 
	        //----------------hashmap--------------------------------
	        HashMap<Integer,String> hm=new HashMap<Integer,String>();
	        hm.put(100,"Chinni");
	        hm.put(104,"Amma"); 
	        hm.put(101,"Naana");
	        hm.put(102,"Kunni");
	        System.out.println("-----------Hash map-----------");
	        for (Map.Entry m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	    }
	}