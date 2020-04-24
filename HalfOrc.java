
public class HalfOrc  extends Race{
	private int strength = 2;
	private int dexterity = 0;
	private int constitution = 1;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int speed = 30;
	
	private String trait="Darkvision\r\n" + 
			"\r\n" + 
			"Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.\r\n" + 
			"Menacing\r\n" + 
			"\r\n" + 
			"You gain proficiency in the Intimidation skill.\r\n" +  
			"Savage Attacks\r\n" + 
			"\r\n" + 
			"When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.";
	
	private String description ="Whether united under the leadership of a mighty warlock or having fought to a standstill after years of conflict, orc and human tribes sometimes form alliances, joining forces into a larger horde to the terror of civilized lands nearby. When these alliances are sealed by marriages, half-orcs are born. Some half-orcs rise to become proud chiefs of orc tribes, their human blood giving them an edge over their full-blooded orc rivals. Some venture into the world to prove their worth among humans and other more civilized races. Many of these become adventurers, achieving greatness for their mighty deeds and notoriety for their barbaric customs and savage fury.\r\n" + 
			"Scarred and Strong\r\n" + 
			"\r\n" + 
			"Half-orcs’ grayish pigmentation, sloping foreheads, jutting jaws, prominent teeth, and towering builds make their orcish heritage plain for all to see. Half-orcs stand between 5 and 7 feet tall and usually weigh between 180 and 250 pounds.\r\n" + 
			"\r\n" + 
			"Orcs regard battle scars as tokens of pride and ornamental scars as things of beauty. Other scars, though, mark an orc or half-orc as a former slave or a disgraced exile. Any half-orc who has lived among or near orcs has scars, whether they are marks of humiliation or of pride, recounting their past exploits and injuries. Such a half-orc living among humans might display these scars proudly or hide them in shame.\r\n" + 
			"The Mark of Gruumsh\r\n" + 
			"\r\n" + 
			"The one-eyed god Gruumsh created the orcs, and even those orcs who turn away from his worship can’t fully escape his influence. The same is true of half-orcs, though their human blood moderates the impact of their orcish heritage. Some half-orcs hear the whispers of Gruumsh in their dreams, calling them to unleash the rage that simmers within them. Others feel Gruumsh’s exultation when they join in melee combat—and either exult along with him or shiver with fear and loathing. Half-orcs are not evil by nature, but evil does lurk within them, whether they embrace it or rebel against it.\r\n" + 
			"\r\n" + 
			"Beyond the rage of Gruumsh, half-orcs feel emotion powerfully. Rage doesn’t just quicken their pulse, it makes their bodies burn. An insult stings like acid, and sadness saps their strength. But they laugh loudly and heartily, and simple bodily pleasures—feasting, drinking, wrestling, drumming, and wild dancing—fill their hearts with joy. They tend to be short-tempered and sometimes sullen, more inclined to action than contemplation and to fighting than arguing. The most accomplished half-orcs are those with enough self-control to get by in a civilized land.\r\n" + 
			"Tribes and Slums\r\n" + 
			"\r\n" + 
			"Half-orcs most often live among orcs. Of the other races, humans are most likely to accept half-orcs, and half-orcs almost always live in human lands when not living among orc tribes. Whether proving themselves among rough barbarian tribes or scrabbling to survive in the slums of larger cities, half-orcs get by on their physical might, their endurance, and the sheer determination they inherit from their human ancestry.";
	
	private String Resistance ="Relentless Endurance\r\n" + 
			"\r\n" + 
			"When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.";
	
public HalfOrc() {
		
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
			default:
				System.out.println("There are no sub races for Half-Orcs");
				break;	
			}
		}
	
}


