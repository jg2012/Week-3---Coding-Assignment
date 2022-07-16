
public class CA12 {

	public static void main(String[] args) {
		boolean isHotOutside = false; 
		double moneyInPocket = 2.75; 
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

	}
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
		System.out.print("12.) It's hot outside and I have more than $10.50 in my pocket. Therefore this statement is: ");
			return true; 
		}else {
			System.out.print("12.) Is it hot outside? " + isHotOutside + " How much money do I have in my pocket? " + "$"+ moneyInPocket + " Therefore this statement is: ");
		}return false; 
	}
	

}
