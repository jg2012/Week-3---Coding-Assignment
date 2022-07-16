
public class CA11 {

	public static void main(String[] args) {
		double numberSet1 [] = {12,15,38,49,22};
		double numberSet2 [] = {33,7,6,3,35}; 
		System.out.println(averageOfTwoArrays(numberSet1,numberSet2)); 
		
	}
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
			System.out.print("11.) The total for numberSet1 is: " + sum1 + " and " + sum2 + " for numberSet2. Therefore this statement is ");
			return true; 
		}  else {
		System.out.print("11.) The total for numberSet1 is: " + sum1 + " and " + sum2 + " for numberSet2. Therefore this statment is: ");
		}return false; 
    }
	

}
