package errorHandling;

import java.util.Scanner;

public class MyError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" give me a number to divide with");
		Scanner ui = new Scanner (System.in);
		int N = ui.nextInt();
		
		int[] grades = {26,25,42};
		
		try {
			System.out.println(grades[3]);
			System.out.println(8/N);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("dont enter zero, we cant divide by that ");
		}
		catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("no index 6");
		}
			finally {
				System.out.println("Bye");
				System.out.println("hello");
			}	
			
	}

}
