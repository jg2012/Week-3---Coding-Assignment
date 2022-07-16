import java.util.Scanner;

public class CA13 {

	public static void main(String[] args) {
		/*
		 * The problem I want to solve here is to gauge someone's stressLevel.  I will do this by asking how they respond on a scale from 0 to 10. 
		 * 
		 * 0 meaning no stress 
		 * 5 meaning  mildly  stressed 
		 * 10 meaning Extremely stressed 
		 *
		 * 
		 */
		String[] stressLevel = new String[0]; 
		stressed(stressLevel);
		
		
	}
	public static void stressed(String[] stressLevel) {
		int stress =0; 
		Scanner s = new Scanner(System.in); 
		do {
			System.out.println("On a scale from 0 to 10, How stressed do you feel? O meaning no stress at all and 10 meaning the most stressed you have ever felt.");
			stress = s.nextInt(); 
		if (stress >=0 && stress <5) {
			System.out.println("Very little to no stress.");	
		}else if(stress >= 5 && stress <=7) {
			System.out.println("Stressed");
		}else if (stress >= 8 && stress <= 10){
			System.out.println("Very Stressed");
		} 
		}while (stress < 0 || stress > 10); 
			
	}

}
