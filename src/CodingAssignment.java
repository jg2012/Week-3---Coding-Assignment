
public class CodingAssignment {

	public static void main(String[] args) {

		int [] ages = {3,9,23,64,2,8,28,93,25}; 
		
		int x = ages[ages.length -1]; 
		System.out.println("The first element subtracted from the last elemsent equals: " + (x-ages[0]));
				
		double sum = 0; 
		
		for(int add: ages) {
			sum+= add; 
		}
		double average = sum / ages.length; 
		System.out.println("The average age is: " + average);
		
		String [] names = {"Sam","Tommy", "Tim","Sally","Buck", "Bob"}; 
		double sumOfLetters = 0; 
		for(String name: names) {
			sumOfLetters += name.length(); 
		}
		double averageOfLetters = sumOfLetters / names.length; 
		System.out.println("There is an average of " + averageOfLetters + " letters per name.");

		System.out.println("The laast element in the array is: " + ages[ages.length-1]);

		System.out.println("The first Elment in array is: " + ages[0]);
		
		int nameLengths[] = new int [names.length]; 
		
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i]= names[i]; 
			nameLengths[0]++; 
			System.out.println(nameLengths[i]);
			
			
		}
		
	}

}
