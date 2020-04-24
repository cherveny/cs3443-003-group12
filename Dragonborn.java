
public class Dragonborn extends Race{
	
	private int strength = 2;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 1;
	
	private int speed = 30;
	
	private String trait="";
	
	private String description = "Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life.\r\n" + 
			"Proud Dragon Kin\r\n" + 
			"\r\n" + 
			"Dragonborn look very much like dragons standing erect in humanoid form, though they lack wings or a tail. The first dragonborn had scales of vibrant hues matching the colors of their dragon kin, but generations of interbreeding have created a more uniform appearance. Their small, fine scales are usually brass or bronze in color, sometimes ranging to scarlet, rust, gold, or copper-green. They are tall and strongly built, often standing close to 6½ feet tall and weighing 300 pounds or more. Their hands and feet are strong, talonlike claws with three fingers and a thumb on each hand.\r\n" + 
			"\r\n" + 
			"The blood of a particular type of dragon runs very strong through some dragonborn clans. These dragonborn often boast scales that more closely match those of their dragon ancestor—bright red, green, blue, or white, lustrous black, or gleaming metallic gold, silver, brass, copper, or bronze.\r\n" + 
			"Self-Sufficient Clans\r\n" + 
			"\r\n" + 
			"To any dragonborn, the clan is more important than life itself. Dragonborn owe their devotion and respect to their clan above all else, even the gods. Each dragonborn’s conduct reflects on the honor of his or her clan, and bringing dishonor to the clan can result in expulsion and exile. Each dragonborn knows his or her station and duties within the clan, and honor demands maintaining the bounds of that position.\r\n" + 
			"\r\n" + 
			"A continual drive for self-improvement reflects the self-sufficiency of the race as a whole. Dragonborn value skill and excellence in all endeavors. They hate to fail, and they push themselves to extreme efforts before they give up on something. A dragonborn holds mastery of a particular skill as a lifetime goal. Members of other races who share the same commitment find it easy to earn the respect of a dragonborn.\r\n" + 
			"\r\n" + 
			"Though all dragonborn strive to be self-sufficient,  they recognize that help is sometimes needed in difficult situations. But the best source for such help is the clan, and when a clan needs help, it turns to another dragonborn clan before seeking aid from other races—or even from the gods.\r\n" + "\r\n" + 
			"					\r\n" + "Dragonborn Traits\r\n" + 
					"Your draconic heritage manifests in a variety of traits you share with other dragonborn.\r\n" + 
					"Ability Score Increase\r\n" + 
					"\r\n" + 
					"Your Strength score increases by 2, and your Charisma score increases by 1.\r\n" + 
					"Age\r\n" + 
					"\r\n" + 
					"Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80.\r\n" + 
					"Alignment\r\n" + 
					"\r\n" + 
					"Dragonborn tend to extremes, making a conscious choice for one side or the other in the cosmic war between good and evil (represented by Bahamut and Tiamat, respectively). Most dragonborn are good, but those who side with Tiamat can be terrible villains.\r\n" + 
					"Size\r\n" + 
					"\r\n" + 
					"Dragonborn are taller and heavier than humans, standing well over 6 feet tall and averaging almost 250 pounds. Your size is Medium.\r\n" + 
					"Speed\r\n" + 
					"\r\n" + 
					"Your base walking speed is 30 feet.\r\n" + 
					"Draconic Ancestry\r\n" + 
					"\r\n" + 
					"You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type";
	private String Resistance = "Damage Resistance\r\n" + 
			"\r\n" + 
			"You have resistance to the damage type associated with your draconic ancestry.";
	
	public Dragonborn(){
		
	}
	
	/////////////////      ABILITY SCORE GETTERS    ///////////////////
	public int getStrength()
	{
		return this.strength;
	}
	
	public int getDexterity()
	{
		return this.dexterity;
	}
	
	public int getConstituition()
	{
		return this.constitution;
	}
	
	public int getIntelligence()
	{
		return this.intelligence;
	}
	
	public int getWisdom()
	{
		return this.wisdom;
	}
	
	public int getCharisma()
	{
		return this.charisma;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getTrait() {
		return trait;
	}
	
	public String getDescription() {
		return description ;
	}
	
	public String getResistance() {
		return Resistance; 
	}
	//////////////////////// setters  ///////////////
	
 	public void chooseTrait(int choice) {
		
		switch (choice) {
		
		case 1:
			trait = "Black Dragon:   Breath Type: Acid	Breath Damage Area: 5 by 30 ft. line (Dex. save)";
			break;
		case 2:
			trait = "Blue Dragon:   Breath Type: Lightning	Breath Damage Area: 5 by 30 ft. line (Dex. save)";
			break;
		case 3:
			trait = "Brass Dragon:   Breath Type: Fire	Breath Damage Area: 5 by 30 ft. line (Dex. save)";
			break;
		case 4:
			trait = "Bronze Dragon:   Breath Type: Lightning	Breath Damage Area: 5 by 30 ft. line (Dex. save)";
			break;
		case 5:
			trait = "Copper Dragon:   Breath Type: Acid	Breath Damage Area: 5 by 30 ft. line (Dex. save)";
			break;
		case 6:
			trait = "Gold Dragon:   Breath Type: Fire	Breath Damage Area: 15 ft. cone (Dex. save)";
			break;
		case 7:
			trait = "Green Dragon:   Breath Type: Poison	Breath Damage Area: 15 ft. cone (Dex. save)";
			break;
		case 8:
			trait = "Red Dragon:   Breath Type: Fire	Breath Damage Area: 15 ft. cone (Dex. save)";
			break;
		case 9:
			trait = "Silver Dragon:   Breath Type: Cold	Breath Damage Area: 15 ft. cone (Dex. save)";
			break;
		case 10:
			trait = "White Dragon:   Breath Type: Cold	Breath Damage Area: 15 ft. cone (Dex. save)";
			break;
		default :
			System.out.println("Unknown selection for dragonborn trait");
			break;
				
			
		}
	}

	
	
}
