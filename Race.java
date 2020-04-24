
public abstract class  Race {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	private int speed;
	
	private String trait;
	
	private String description;
	
	public abstract int getStrength();
	
	public abstract int getDexterity();
	
	public abstract int getConstituition();
	
	public abstract int getIntelligence();
	
	public abstract int getWisdom();
	
	public abstract int getCharisma();
	
	public abstract int getSpeed();
	
	public abstract String getTrait();
	
	public abstract String getDescription();
	
	public abstract String getResistance();
	//////////////////////// setters  ///////////////
	
 	public abstract void chooseTrait(int choice); 
}
