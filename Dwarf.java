
public class Dwarf extends Race {
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 2;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int speed = 25;
	
	private String trait="Dwarven Resilience\r\n" + 
			"\r\n" + 
			"You have advantage on saving throws against poison, and you have resistance against poison damage\r\n ";
	
	private String description = "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.\r\n" + 
			"Short and Stout\r\n" + 
			"\r\n" + 
			"Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal. Though they stand well under 5 feet tall, dwarves are so broad and compact that they can weigh as much as a human standing nearly two feet taller. Their courage and endurance are also easily a match for any of the larger folk.\r\n" + 
			"\r\n" + 
			"Dwarven skin ranges from deep brown to a paler hue tinged with red, but the most common shades are light brown or deep tan, like certain tones of earth. Their hair, worn long but in simple styles, is usually black, gray, or brown, though paler dwarves often have red hair. Male dwarves value their beards highly and groom them carefully.\r\n" + 
			"Long Memory, Long Grudges\r\n" + 
			"\r\n" + 
			"Dwarves can live to be more than 400 years old, so the oldest living dwarves often remember a very different world. For example, some of the oldest dwarves living in Citadel Felbarr (in the world of the Forgotten Realms) can recall the day, more than three centuries ago, when orcs conquered the fortress and drove them into an exile that lasted over 250 years. This longevity grants them a perspective on the world that shorter-lived races such as humans and halflings lack.\r\n" + 
			"\r\n" + 
			"Dwarves are solid and enduring like the mountains they love, weathering the passage of centuries with stoic endurance and little change. They respect the traditions of their clans, tracing their ancestry back to the founding of their most ancient strongholds in the youth of the world, and don’t abandon those traditions lightly. Part of those traditions is devotion to the gods of the dwarves, who uphold the dwarven ideals of industrious labor, skill in battle, and devotion to the forge.\r\n" + 
			"\r\n" + 
			"Individual dwarves are determined and loyal, true to their word and decisive in action, sometimes to the point of stubbornness. Many dwarves have a strong sense of justice, and they are slow to forget wrongs they have suffered. A wrong done to one dwarf is a wrong done to the dwarf’s entire clan, so what begins as one dwarf’s hunt for vengeance can become a full-blown clan feud.\r\n" + 
			"Clans and Kingdoms\r\n" + 
			"\r\n" + 
			"Dwarven kingdoms stretch deep beneath the mountains where the dwarves mine gems and precious metals and forge items of wonder. They love the beauty and artistry of precious metals and fine jewelry, and in some dwarves this love festers into avarice. Whatever wealth they can’t find in their mountains, they gain through trade. They dislike boats, so enterprising humans and halflings frequently handle trade in dwarven goods along water routes. Trustworthy members of other races are welcome in dwarf settlements, though some areas are off limits even to them.\r\n" + 
			"\r\n" + 
			"The chief unit of dwarven society is the clan, and dwarves highly value social standing. Even dwarves who live far from their own kingdoms cherish their clan identities and affiliations, recognize related dwarves, and invoke their ancestors’ names in oaths and curses. To be clanless is the worst fate that can befall a dwarf.\r\n" + 
			"\r\n" + 
			"Dwarves in other lands are typically artisans, especially weaponsmiths, armorers, and jewelers. Some become mercenaries or bodyguards, highly sought after for their courage and loyalty.\r\n" + 
			"Gods, Gold, and Clan\r\n" + 
			"\r\n" + 
			"Dwarves who take up the adventuring life might be motivated by a desire for treasure—for its own sake, for a specific purpose, or even out of an altruistic desire to help others. Other dwarves are driven by the command or inspiration of a deity, a direct calling or simply a desire to bring glory to one of the dwarf gods. Clan and ancestry are also important motivators. A dwarf might seek to restore a clan’s lost honor, avenge an ancient wrong the clan suffered, or earn a new place within the clan after having been exiled. Or a dwarf might search for the axe wielded by a mighty ancestor, lost on the field of battle centuries ago."
			+"\r\n" + "Dwarf Traits\r\n" + 
			"Your dwarf character has an assortment of inborn abilities, part and parcel of dwarven nature.\r\n" + 
			"Ability Score Increase\r\n" + 
			"\r\n" + 
			"Your Constitution score increases by 2.\r\n" + 
			"Age\r\n" + 
			"\r\n" + 
			"Dwarves mature at the same rate as humans, but they’re considered young until they reach the age of 50. On average, they live about 350 years.\r\n" + 
			"Alignment\r\n" + 
			"\r\n" + 
			"Most dwarves are lawful, believing firmly in the benefits of a well-ordered society. They tend toward good as well, with a strong sense of fair play and a belief that everyone deserves to share in the benefits of a just order.\r\n" + 
			"Size\r\n" + 
			"\r\n" + 
			"Dwarves stand between 4 and 5 feet tall and average about 150 pounds. Your size is Medium.\r\n" + 
			"Speed\r\n" + 
			"\r\n" + 
			"Your base walking speed is 25 feet. Your speed is not reduced by wearing heavy armor.\r\n" + 
			"Darkvision\r\n" + 
			"\r\n" + 
			"Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.\r\n" + 
			"Dwarven Resilience\r\n" + 
			"\r\n" + 
			"You have advantage on saving throws against poison, and you have resistance against poison damage (explained in the “Combat” section).\r\n" + 
			"Dwarven Combat Training\r\n" + 
			"\r\n" + 
			"You have proficiency with the battleaxe, handaxe, light hammer, and warhammer.\r\n" + 
			"Tool Proficiency\r\n" + 
			"\r\n" + 
			"You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or mason’s tools.\r\n" + 
			"Stonecunning\r\n" + 
			"\r\n" + 
			"Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.\r\n" + 
			"Languages\r\n" + 
			"\r\n" + 
			"You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak.";
	private String Resistance = "No Race Resistance";
	
	public Dwarf() {
		
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
			trait = trait +"\r\n" + "Hill Dwarf:   Dwarven Toughness: Your hit point maximum increases by 1, and it increases by 1 every time you gain a level";
			wisdom = 1;
			break;
		case 2:
			trait =trait +"\r\n" +  "Mountain Dwarf:   Dwarven Armor Training: You have proficiency with light and medium armor";
			strength = 2;
			break;
		default :
			System.out.println("Unknown selection for Dwarven Type");
			break;
				
			
		}
	}
}
