package MainPackage;

////////   race manager for Gnome race
public class Gnome  extends Race{
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 2;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int speed = 25;
	
	private String trait="";
	
	private String description ="A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their close-knit communities. Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially bursts of laughter. Gnomes take delight in life, enjoying every moment of invention, exploration, investigation, creation, and play.\r\n" + 
			"Vibrant Expression\r\n" + 
			"\r\n" + 
			"A gnome’s energy and enthusiasm for living shines through every inch of his or her tiny body. Gnomes average slightly over 3 feet tall and weigh 40 to 45 pounds. Their tan or brown faces are usually adorned with broad smiles (beneath their prodigious noses), and their bright eyes shine with excitement. Their fair hair has a tendency to stick out in every direction, as if expressing the gnome’s insatiable interest in everything around.\r\n" + 
			"\r\n" + 
			"A gnome’s personality is writ large in his or her appearance. A male gnome’s beard, in contrast to his wild hair, is kept carefully trimmed but often styled into curious forks or neat points. A gnome’s clothing, though usually made in modest earth tones, is elaborately decorated with embroidery, embossing, or gleaming jewels.\r\n" + 
			"Delighted Dedication\r\n" + 
			"\r\n" + 
			"As far as gnomes are concerned, being alive is a wonderful thing, and they squeeze every ounce of enjoyment out of their three to five centuries of life. Humans might wonder about getting bored over the course of such a long life, and elves take plenty of time to savor the beauties of the world in their long years, but gnomes seem to worry that even with all that time, they can’t get in enough of the things they want to do and see.\r\n" + 
			"\r\n" + 
			"Gnomes speak as if they can’t get the thoughts out of their heads fast enough. Even as they offer ideas and opinions on a range of subjects, they still manage to listen carefully to others, adding the appropriate exclamations of surprise and appreciation along the way.\r\n" + 
			"\r\n" + 
			"Though gnomes love jokes of all kinds, particularly puns and pranks, they’re just as dedicated to the more serious tasks they undertake. Many gnomes are skilled engineers, alchemists, tinkers, and inventors. They’re willing to make mistakes and laugh at themselves in the process of perfecting what they do, taking bold (sometimes foolhardy) risks and dreaming large.\r\n" + 
			"Bright Burrows\r\n" + 
			"\r\n" + 
			"Gnomes make their homes in hilly, wooded lands. They live underground but get more fresh air than dwarves do, enjoying the natural, living world on the surface whenever they can. Their homes are well hidden by both clever construction and simple illusions. Welcome visitors are quickly ushered into the bright, warm burrows. Those who are not welcome are unlikely to find the burrows in the first place.\r\n" + 
			"\r\n" + 
			"Gnomes who settle in human lands are commonly gemcutters, engineers, sages, or tinkers. Some human families retain gnome tutors, ensuring that their pupils enjoy a mix of serious learning and delighted enjoyment. A gnome might tutor several generations of a single human family over the course of his or her long life";
	
	private String Resistance ="You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic";
	
	public Gnome() {
		
	}
		/////// setters  and getters
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
				trait ="Deep Gnome:   Superior Darkvision\r\n" + 
						"\r\n" + 
						"Your darkvision has a radius of 120 feet.\r\n" + 
						"Stone Camouflage\r\n" + 
						"\r\n" + 
						"You have advantage on Dexterity (stealth) checks to hide in rocky terrain.\r\n" + 
						"Languages\r\n" + 
						"\r\n" + 
						"You can speak, read, and write Common, Gnomish, and Undercommon. The svirfneblin dialect is more guttural than surface Gnomish, and most svirfneblin know only a little bit of Common, but those who deal with outsiders (and that includes you as an adventurer) pick up enough Common to get by in other lands.";
				dexterity = 1;
				break;
			case 2:
				trait ="Rock Gnome:   Artificer’s Lore\r\n" + 
						"\r\n" + 
						"Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.\r\n" + 
						"Tinker\r\n" + 
						"\r\n" + 
						"You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time.\r\n" + 
						"\r\n" + 
						"When you create a device, choose one of the following options:\r\n" + 
						"\r\n" + 
						"Clockwork Toy. This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.\r\n" + 
						"\r\n" + 
						"Fire Starter. The device produces a miniature flame, which you can use to light a candle, torch, or campfire. Using the device requires your action.\r\n" + 
						"\r\n" + 
						"Music Box. When opened, this music box plays a single song at a moderate volume.\r\n" + 
						"The box stops playing when it reaches the song’s end or when it is closed.";
				constitution = 1;
				break;
			default :
				System.out.println("Unknown selection for Gnome Type");
				break;
					
				
			}
		}
	
}
