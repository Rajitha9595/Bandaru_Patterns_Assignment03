package genericdemo;

public class GenericDemo {
	
		   public static < E > void printArray( E[] inputArray ) {
		      
		      for(E ele : inputArray) {
		         System.out.printf("%s ", ele);
		      }
		      System.out.println();
		   }

		   public static void main(String args[]) {
		      
		      
		      Character[] characters = { 'W', 'O', 'R', 'L', 'D' };
		      Integer[] numbers = { 1, 4, 3, 2, 5 };
		      Double[] doubles = { 1.1,4.4,3.3, 2.2,5.5 };
		      

		      System.out.println("\nArray characterArray contains:");
		      printArray(characters); 

		      System.out.println("Array integerArray contains:");
		      printArray(numbers); 

		      System.out.println("\nArray doubleArray contains:");
		      printArray(doubles);  

		   }
		}