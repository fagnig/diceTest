package terning;
import java.util.Random;
public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		Random d1 = new Random();  // opretter random objekt da vi kan s�tte den ekskluderende gr�nse                
		int d3 = d1.nextInt(6)+1;  /* tildeler d3 variablen en random v�rdi mellem 0 og 5 og l�gger 1
		 							  til for at f� en v�rdi mellem 1 og 6*/          
		return d3 ;          		// returnere d3           		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}