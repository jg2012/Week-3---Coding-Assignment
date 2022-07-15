import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		//1A.) 
		int [] ages = {3,9,23,64,2,8,28,93,25}; 
		
		//1B.) 
		int x = ages[ages.length -1]; 
		System.out.println("1B.) The first element subtracted from the last elemsent equals: " + (x-ages[0]));
		
		//1C.) 
		double sum = 0; 
		
		for(int add: ages) {
			sum+= add; 
		}
		double average = sum / ages.length; 
		System.out.println("1C.) The average age is: " + average);
		
		//2A.) 
		String [] names = {"2A.) Sam","Tommy", "Tim","Sally","Buck", "Bob"}; 
		double sumOfLetters = 0; 
		for(String name: names) {
			sumOfLetters += name.length(); 
		}
		//2B.) 
		double averageOfLetters = sumOfLetters / names.length; 
		System.out.println("2B.) There is an average of " + averageOfLetters + " letters per name.");
		
		//3.)
		System.out.println("3.) The last element in the array is: " + ages[ages.length-1]);
		
		//4.)
		System.out.println("4.) The first Elment in array is: " + ages[0]);
		
		//5.)
		int [] nameLengths = new int [6]; 
	
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 	
		}
		System.out.print("5.) Name Lengths for each element in the array are as follows: ");
		System.out.println(Arrays.toString(nameLengths));
		
		//6.)
		int namesum =0; 
		for(int i = 0; i<nameLengths.length; i++) {
			namesum = namesum + nameLengths[i]; 
		}
		System.out.print("6.) Sum of all letters equals: ");
		System.out.println(namesum);
		 
		 
		
		
		
	}

}
