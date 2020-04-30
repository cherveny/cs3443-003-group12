package MainPackage;


import java.util.Random;



public class DiceRoll {
	
	static Random dice = new Random();
	
//////////  R O L L   A N Y   S I Z E   D I C E   ////////////
	public static int DiceThrow(int dieMax) {
		int result = dice.nextInt(dieMax)+1;
		return result;
	}
//////////  R O L L   A   S I N G L E   S T A T  ////////////
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
