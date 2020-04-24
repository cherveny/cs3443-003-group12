
public class Elf extends Race {
	private int strength = 0;
	private int dexterity = 2;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int speed = 30;
	
	private String trait="";
	
	private String description ="Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\r\n" + 
			"Slender and Graceful\r\n" + 
			"\r\n" + 
			"With their unearthly grace and fine features, elves appear hauntingly beautiful to humans and members of many other races. They are slightly shorter than humans on average, ranging from well under 5 feet tall to just over 6 feet. They are more slender than humans, weighing only 100 to 145 pounds. Males and females are about the same height, and males are only marginally heavier than females.\r\n" + 
			"\r\n" + 
			"Elves’ coloration encompasses the normal human range and also includes skin in shades of copper, bronze, and almost bluish-white, hair of green or blue, and eyes like pools of liquid gold or silver. Elves have no facial and little body hair. They favor elegant clothing in bright colors, and they enjoy simple yet lovely jewelry.\r\n" + 
			"A Timeless Perspective\r\n" + 
			"\r\n" + 
			"Elves can live well over 700 years, giving them a broad perspective on events that might trouble the shorter-lived races more deeply. They are more often amused than excited, and more likely to be curious than greedy. They tend to remain aloof and unfazed by petty happenstance. When pursuing a goal, however, whether adventuring on a mission or learning a new skill or art, elves can be focused and relentless. They are slow to make friends and enemies, and even slower to forget them. They reply to petty insults with disdain and to serious insults with vengeance.\r\n" + 
			"\r\n" + 
			"Like the branches of a young tree, elves are flexible in the face of danger. They trust in diplomacy and compromise to resolve differences before they escalate to violence. They have been known to retreat from intrusions into their woodland homes, confident that they can simply wait the invaders out. But when the need arises, elves reveal a stern martial side, demonstrating skill with sword, bow, and strategy.\r\n" + 
			"Hidden Woodland Realms\r\n" + 
			"\r\n" + 
			"Most elves dwell in small forest villages hidden among the trees. Elves hunt game, gather food, and grow vegetables, and their skill and magic allow them to support themselves without the need for clearing and plowing land. They are talented artisans, crafting finely worked clothes and art objects. Their contact with outsiders is usually limited, though a few elves make a good living by trading crafted items for metals (which they have no interest in mining).\r\n" + 
			"\r\n" + 
			"Elves encountered outside their own lands are commonly traveling minstrels, artists, or sages. Human nobles compete for the services of elf instructors to teach swordplay or magic to their children.\r\n" + 
			"Exploration and Adventure\r\n" + 
			"\r\n" + 
			"Elves take up adventuring out of wanderlust. Since they are so long-lived, they can enjoy centuries of exploration and discovery. They dislike the pace of human society, which is regimented from day to day but constantly changing over decades, so they find careers that let them travel freely and set their own pace. Elves also enjoy exercising their martial prowess or gaining greater magical power, and adventuring allows them to do so. Some might join with rebels fighting against oppression, and others might become champions of moral causes.";
	
private String Resistance = "Advantage against being Charmed, and magic can't put you to sleep";

public Elf() {
	
}
	
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
			trait ="Eladrin:   Elf Weapon Training\r\n" + 
					"\r\n" + 
					"You have proficiency with the longsword, shortsword, shortbow, and longbow.\r\n" + 
					"Fey Step\r\n" + 
					"\r\n" + 
					"You can cast the misty step spell once using this trait. You regain the ability to do so when you finish a short or long rest.";
			intelligence = 1;
			break;
		case 2:
			trait ="High Elf:   Elf Weapon Training\r\n" + 
					"\r\n" + 
					"You have proficiency with the longsword, shortsword, shortbow, and longbow.\r\n" + 
					"Cantrip\r\n" + 
					"\r\n" + 
					"You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.\r\n" + 
					"Extra Language\r\n" + 
					"\r\n" + 
					"You can speak, read, and write one extra language of your choice.";
			intelligence = 1;
			break;
		case 3:
			trait ="Wood Elf:   Elf Weapon Training\r\n" + 
					"\r\n" + 
					"You have proficiency with the longsword, shortsword, shortbow, and longbow.\r\n" + 
					"Fleet of Foot\r\n" + 
					"\r\n" + 
					"Your base walking speed increases to 35 feet.\r\n" + 
					"Mask of the Wild\r\n" + 
					"\r\n" + 
					"You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.";
			wisdom = 1;
			break;
		default :
			System.out.println("Unknown selection for Elven Type");
			break;
				
			
		}
	}
}
