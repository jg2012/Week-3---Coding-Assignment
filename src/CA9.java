
public class CA9 {

	public static void main(String[] args) {
		int number []= {10,12, 13, 25, 33, 55}; 
		System.out.println(greaterThan(number));
	}
	
	public static boolean greaterThan(int [] number  ) {
		int numberTotal=0; 
		for(int total: number) {
			numberTotal += total; 
		}
		if (numberTotal < 100) {
			System.out.print("9.) The total of the numbers in this array is, " + numberTotal  +" ,which makes this statment " );
		 return false; 
		}else {
			System.out.print("9.) The total of the numbers in this array is, " + numberTotal  +" ,which makes this statment " );

		}return true; 
		
	}
	

}
