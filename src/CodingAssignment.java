import java.util.Arrays;
import java.util.Scanner;

public class CodingAssignment {

	public static void main(String[] args) {
		//1A.) 
		int [] ages = {3,9,23,64,2,8,28,93,25}; 
		
		//1B.) 
		int x = ages[ages.length -1]; 
		System.out.println("1B.) The first element subtracted from the last elemsent equals: " + (x-ages[0]) + ".");
		
		//1C.) 
		double sum = 0; 
		
		for(int add: ages) {
			sum+= add; 
		}
		double average = sum / ages.length; 
		System.out.println("1C.) The average age is: " + average + ".");
		
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
		System.out.println("3.) The last element in the array is: " + ages[ages.length-1] + ".");
		
		//4.)
		System.out.println("4.) The first Elment in array is: " + ages[0] + ".");
		
		//5.)
		int [] nameLengths = new int [6]; 
	
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 	
		}
		System.out.println("5.) Name Lengths for each element in the array are as follows: " + Arrays.toString(nameLengths)+ ".");
		
		//6.)
		int namesum =0; 
		for(int i = 0; i<nameLengths.length; i++) {
			namesum = namesum + nameLengths[i]; 
		}
		System.out.println("6.) Sum of all letters equals: "+ namesum + ".");
		
		//7.) 
		System.out.print("7.) ");
		System.out.println(wordMultiplier("Hello"+ " ",3));
		
		//8.) 
		String firstName = "Jose";
		String lastName = "Guzman"; 
		System.out.println(fullName("8.) "+ firstName, lastName));
		
		//9.) 
		int number []= {10,12, 13, 23, 33, 35}; 
		System.out.println(greaterThan(number));
		
		//10.)
		double twoNumbers []= {33,35}; 
		System.out.println("10.) The average of: " + Arrays.toString(twoNumbers) + " is " + averageOfTwo(twoNumbers)+".");
		
		//11.) 
		double numberSet1 [] = {12,5,8,9,22};
		double numberSet2 [] = {33,7,6,3,35}; 
		System.out.println(averageOfTwoArrays(numberSet1,numberSet2)); 
		
		//12.)
		boolean isHotOutside = true; 
		double moneyInPocket = 2.75; 
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	}
	
	//Methods listed below: 
	
		//7.) 
		public static String wordMultiplier(String word, int x) {
			String y = "";
			for(int i = 0; i < x; i++) {
				y += word; 
			}return y; 		
		}
		
		//8.) 
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName; 
		}
		
		//9.) 
		public static boolean greaterThan(int [] number  ) {
		 int numberTotal=0; 
		for(int i=0; i<=number.length; i++)	{
			numberTotal += number[i];
			
			if(numberTotal  >  100) {
				System.out.print("9.) The total of the numbers in this array is, " + numberTotal  +" ,which makes this statment " );
				return true; 
			}
		  }return false; 
		}
		
		//10.) 
		public static double averageOfTwo(double []twoNumbers) {
			double sum = 0; 
			for(double addingNumbers: twoNumbers) {
				sum += addingNumbers; 
			}return sum / twoNumbers.length; 
		}
		
		//11.) 
		public static boolean averageOfTwoArrays(double []numberSet1, double []numberSet2) {
			double sum1=0; 
			double sum2=0; 
			for (double addition1: numberSet1) {
				sum1 += addition1; 
			}
			for(double addition2: numberSet2) {
				sum2 += addition2; 	
			}
			if(sum1 > sum2) {	
				System.out.print("11.) The total for numberSet1 is: " + sum1 + " and " + sum2 + " for numberSet2.");
				return true; 
			}  else {
			System.out.print("11.) The total for numberSet1 is: " + sum1 + " and " + sum2 + " for numberSet2. Therefore this statment is: ");
			}return false; 
	    }
		
		//12.) 
		public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
			if(isHotOutside && moneyInPocket > 10.50) {
			System.out.print("12.) It's hot outside and I have more than $10.50 in my pocket. Therefore this statement is: ");
				return true; 
			}else {
				System.out.print("12.) Is it hot outside? " + isHotOutside + " How much money do I have in my pocket? " + moneyInPocket + " Therefore this statement is: ");
			}return false; 
		}
		
}
		
		

