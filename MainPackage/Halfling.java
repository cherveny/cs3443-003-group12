package MainPackage;

////   race manager for Halfling race
public class Halfling  extends Race{

	private int strength = 0;
	private int dexterity = 2;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int speed = 25;
	
	private String trait="";
	
	private String description ="The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation. Though some halflings live out their days in remote agricultural communities, others form nomadic bands that travel constantly, lured by the open road and the wide horizon to discover the wonders of new lands and peoples. But even these wanderers love peace, food, hearth, and home, though home might be a wagon jostling along a dirt road or a raft floating downriver.\r\n" + 
			"Small and Practical\r\n" + 
			"\r\n" + 
			"The diminutive halflings survive in a world full of larger creatures by avoiding notice or, barring that, avoiding offense. Standing about 3 feet tall, they appear relatively harmless and so have managed to survive for centuries in the shadow of empires and on the edges of wars and political strife. They are inclined to be stout, weighing between 40 and 45 pounds.\r\n" + 
			"\r\n" + 
			"Halflings’ skin ranges from tan to pale with a ruddy cast, and their hair is usually brown or sandy brown and wavy. They have brown or hazel eyes. Halfling men often sport long sideburns, but beards are rare among them and mustaches even more so. They like to wear simple, comfortable, and practical clothes, favoring bright colors.\r\n" + 
			"\r\n" + 
			"Halfling practicality extends beyond their clothing. They’re concerned with basic needs and simple pleasures and have little use for ostentation. Even the wealthiest of halflings keep their treasures locked in a cellar rather than on display for all to see. They have a knack for finding the most straightforward solution to a problem, and have little patience for dithering.\r\n" + 
			"Kind and Curious\r\n" + 
			"\r\n" + 
			"Halflings are an affable and cheerful people. They cherish the bonds of family and friendship as well as the comforts of hearth and home, harboring few dreams of gold or glory. Even adventurers among them usually venture into the world for reasons of community, friendship, wanderlust, or curiosity. They love discovering new things, even simple things, such as an exotic food or an unfamiliar style of clothing.\r\n" + 
			"\r\n" + 
			"Halflings are easily moved to pity and hate to see any living thing suffer. They are generous, happily sharing what they have even in lean times.\r\n" + 
			"Blend into the Crowd\r\n" + 
			"\r\n" + 
			"Halflings are adept at fitting into a community of humans, dwarves, or elves, making themselves valuable and welcome. The combination of their inherent stealth and their unassuming nature helps halflings to avoid unwanted attention.\r\n" + 
			"\r\n" + 
			"Halflings work readily with others, and they are loyal to their friends, whether halfling or otherwise. They can display remarkable ferocity when their friends, families, or communities are threatened.\r\n" + 
			"Pastoral Pleasantries\r\n" + 
			"\r\n" + 
			"Most halflings live in small, peaceful communities with large farms and well-kept groves. They rarely build kingdoms of their own or even hold much land beyond their quiet shires. They typically don’t recognize any sort of halfling nobility or royalty, instead looking to family elders to guide them. Families preserve their traditional ways despite the rise and fall of empires.\r\n" + 
			"\r\n" + 
			"Many halflings live among other races, where the halflings’ hard work and loyal outlook offer them abundant rewards and creature comforts. Some halfling communities travel as a way of life, driving wagons or guiding boats from place to place and maintaining no permanent home.";
	
	private String Resistance ="Lucky\r\n" + 
			"\r\n" + 
			"When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.\r\n" + 
			"Brave\r\n" + 
			"\r\n" + 
			"You have advantage on saving throws against being frightened.\r\n" + 
			"Halfling Nimbleness\r\n" + 
			"\r\n" + 
			"You can move through the space of any creature that is of a size larger than yours.";
	
public Halfling() {
		
	}
		////////  setters and getters
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
	//// not being used currently    intention is to handle sub-race for the race
		
	 	public void chooseTrait(int choice) {
			
			switch (choice) {
			
			case 1:
				trait="Lightfoot Halfling :	Naturally Stealthy\r\n" + 
						"\r\n" + 
						"You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.";
				charisma = 1;
				break;
			case 2:
				trait="Stout Halfling : Stout Resilience\r\n" + 
						"\r\n" + 
						"You have advantage on saving throws against poison, and you have resistance against poison damage.";
				constitution = 1;
				break;
			default :
				System.out.println("Unknown selection for Gnome Type");
				break;
					
				
			}
		}
	
}
