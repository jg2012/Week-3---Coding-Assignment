import java.util.Arrays;

public class CA10 {

	public static void main(String[] args) {
		double twoNumbers []= {85.3,23.2}; 
		System.out.println("10.) The average of: " + Arrays.toString(twoNumbers) + " is " + averageOfTwo(twoNumbers)+".");
	}
	public static double averageOfTwo(double []twoNumbers) {
		double sum = 0; 
		for(double addingNumbers: twoNumbers) {
			sum += addingNumbers; 
		}return sum / twoNumbers.length; 
	}

}
