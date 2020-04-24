
public class HalfElf  extends Race{
	
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 2;
	
	private int speed = 30;
	
	private String trait="Darkvision\r\n" + 
			"\r\n" + 
			"Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
	
	private String description ="Walking in two worlds but truly belonging to neither, half-elves combine what some say are the best qualities of their elf and human parents: human curiosity, inventiveness, and ambition tempered by the refined senses, love of nature, and artistic tastes of the elves. Some half-elves live among humans, set apart by their emotional and physical differences, watching friends and loved ones age while time barely touches them. Others live with the elves, growing restless as they reach adulthood in the timeless elven realms, while their peers continue to live as children. Many half-elves, unable to fit into either society, choose lives of solitary wandering or join with other misfits and outcasts in the adventuring life.\r\n" + 
			"Of Two Worlds\r\n" + 
			"\r\n" + 
			"To humans, half-elves look like elves, and to elves, they look human. In height, they’re on par with both parents, though they’re neither as slender as elves nor as broad as humans. They range from under 5 feet to about 6 feet tall, and from 100 to 180 pounds, with men only slightly taller and heavier than women. Half-elf men do have facial hair, and sometimes grow beards to mask their elven ancestry. Half-elven coloration and features lie somewhere between their human and elf parents, and thus show a variety even more pronounced than that found among either race. They tend to have the eyes of their elven parents.\r\n" + 
			"Diplomats or Wanderers\r\n" + 
			"\r\n" + 
			"Half-elves have no lands of their own, though they are welcome in human cities and somewhat less welcome in elven forests. In large cities in regions where elves and humans interact often, half-elves are sometimes numerous enough to form small communities of their own. They enjoy the company of other half-elves, the only people who truly understand what it is to live between these two worlds.\r\n" + 
			"\r\n" + 
			"In most parts of the world, though, half-elves are uncommon enough that one might live for years without meeting another. Some half-elves prefer to avoid company altogether, wandering the wilds as trappers, foresters, hunters, or adventurers and visiting civilization only rarely. Like elves, they are driven by the wanderlust that comes of their longevity. Others, in contrast, throw themselves into the thick of society, putting their charisma and social skills to great use in diplomatic roles or as swindlers.";
	
	private String Resistance ="Fey Ancestry\r\n" + 
			"\r\n" + 
			"You have advantage on saving throws against being charmed, and magic can’t put you to sleep";
	
public HalfElf() {
		
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
				strength = 1;
				break;
			case 2:
				dexterity = 1;
				break;
			case 3:
				constitution = 1;
				break;
			case 4:
				intelligence = 1;
				break;
			case 5:
				wisdom = 1;
				break;
			default :
				System.out.println("Unknown selection for Half-Elven Bonus Stats");
				break;
					
				
			}
		}
	
}

