
public class CA7 {

	public static void main(String[] args) {
		System.out.print("7.) ");
		System.out.println(wordMultiplier("Hello"+ " ",4));

	}public static String wordMultiplier(String word, int x) {
		String y = "";
		for(int i = 0; i < x; i++) {
			y += word; 
		}return y; 		
	}

}
