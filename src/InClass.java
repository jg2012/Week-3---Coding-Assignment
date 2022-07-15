import java.util.Scanner;

public class InClass {

	public static void main(String[] args) {
     
		
		
		System.out.println("Please enter 10 numbers");
		Scanner x = new Scanner(System.in); 
 		int [] numbers = new int [10]; 
		
 		for(int i=0; i < numbers.length; i++) {
 			numbers[i]= x.nextInt(); 
 		}x.close();
		
 		System.out.println(numbers[i]);
	} 
	
	public static int getSamllest(int[]numbers) {
		return numbers[0];
		
		
		
	}

}
