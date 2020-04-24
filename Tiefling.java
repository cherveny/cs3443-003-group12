
public class Tiefling  extends Race{
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 1;
	private int wisdom = 0;
	private int charisma = 2;
	
	private int speed = 30;
	
	private String trait="Darkvision\r\n" + 
			"\r\n" + 
			"Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
	
	private String description ="To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling. And to twist the knife, tieflings know that this is because a pact struck generations ago infused the essence of Asmodeus—overlord of the Nine Hells—into their bloodline. Their appearance and their nature are not their fault but the result of an ancient sin, for which they and their children and their children’s children will always be held accountable.\r\n" + 
			"Infernal Bloodline\r\n" + 
			"\r\n" + 
			"Tieflings are derived from human bloodlines, and in the broadest possible sense, they still look human. However, their infernal heritage has left a clear imprint on their appearance. Tieflings have large horns that take any of a variety of shapes: some have curling horns like a ram, others have straight and tall horns like a gazelle’s, and some spiral upward like an antelopes’ horns. They have thick tails, four to five feet long, which lash or coil around their legs when they get upset or nervous. Their canine teeth are sharply pointed, and their eyes are solid colors—black, red, white, silver, or gold—with no visible sclera or pupil. Their skin tones cover the full range of human coloration, but also include various shades of red. Their hair, cascading down from behind their horns, is usually dark, from black or brown to dark red, blue, or purple.\r\n" + 
			"Self-Reliant and Suspicious\r\n" + 
			"\r\n" + 
			"Tieflings subsist in small minorities found mostly in human cities or towns, often in the roughest quarters of those places, where they grow up to be swindlers, thieves, or crime lords. Sometimes they live among other minority populations in enclaves where they are treated with more respect.\r\n" + 
			"\r\n" + 
			"Lacking a homeland, tieflings know that they have to make their own way in the world and that they have to be strong to survive. They are not quick to trust anyone who claims to be a friend, but when a tiefling’s companions demonstrate that they trust him or her, the tiefling learns to extend the same trust to them. And once a tiefling gives someone loyalty, the tiefling is a firm friend or ally for life.";
	
	private String Resistance ="Hellish Resistance\r\n" + 
			"\r\n" + 
			"You have resistance to fire damage.";
	
public Tiefling() {
		
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
				
			default :
				System.out.println("There are no sub races for Tieflings");
				break;
					
				
			}
		}
	
}

