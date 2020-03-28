/***************
 *  this class is for handling the dice roll
 *  it also contains a method for the stats dice roll
 * 
 * @author Mazen Shaban
 *
 */

import java.util.Random;

public class DiceRoll {
	Random dice = new Random();
	
	public int DiceThrow(int dieMax) {
		int result = dice.nextInt(dieMax)+1;
		return result;
	}
	
	public int statRoll() {
		int result;
		int min;
		int total;
		
		int[] statsRolled = new int[4];
		
		for ( int i = 0 ; i < 4 ; i++) {
			statsRolled[i] = DiceThrow(6);
		}
		
		min = statsRolled[0];
		
		for ( int i = 1 ; i < 4 ; i++) {
			if (min > statsRolled[i]) {
				min = statsRolled[i];
			}
		}
		total = 0;
		
		for (int i = 0 ; i < 4 ; i++) {
			total += statsRolled[i];
		}
		result = total - min;
		
		return result;
		
	}
}
