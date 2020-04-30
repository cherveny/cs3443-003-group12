package MainPackage;

///////////   race manager for the human race
public class Human  extends Race{
	
	private int strength = 1;
	private int dexterity = 1;
	private int constitution = 1;
	private int intelligence = 1;
	private int wisdom = 1;
	private int charisma = 1;
	
	private int speed = 30;
	
	private String trait="Languages\r\n" + 
			"\r\n" + 
			"You can speak, read, and write Common and one extra language of your choice. Humans typically learn the languages of other peoples they deal with, including obscure dialects. They are fond of sprinkling their speech with words borrowed from other tongues: Orc curses, Elvish musical expressions, Dwarvish military phrases, and so on.";
	
	private String description ="In the reckonings of most worlds, humans are the youngest of the common races, late to arrive on the world scene and short-lived in comparison to dwarves, elves, and dragons. Perhaps it is because of their shorter lives that they strive to achieve as much as they can in the years they are given. Or maybe they feel they have something to prove to the elder races, and that’s why they build their mighty empires on the foundation of conquest and trade. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.\r\n" + 
			"A Broad Spectrum\r\n" + 
			"\r\n" + 
			"With their penchant for migration and conquest, humans are more physically diverse than other common races. There is no typical human. An individual can stand from 5 feet to a little over 6 feet tall and weigh from 125 to 250 pounds. Human skin shades range from nearly black to very pale, and hair colors from black to blond (curly, kinky, or straight); males might sport facial hair that is sparse or thick. A lot of humans have a dash of nonhuman blood, revealing hints of elf, orc, or other lineages. Humans reach adulthood in their late teens and rarely live even a single century.\r\n" + 
			"Variety in All Things\r\n" + 
			"\r\n" + 
			"Humans are the most adaptable and ambitious people among the common races. They have widely varying tastes, morals, and customs in the many different lands where they have settled. When they settle, though, they stay: they build cities to last for the ages, and great kingdoms that can persist for long centuries. An individual human might have a relatively short life span, but a human nation or culture preserves traditions with origins far beyond the reach of any single human’s memory. They live fully in the present—making them well suited to the adventuring life—but also plan for the future, striving to leave a lasting legacy. Individually and as a group, humans are adaptable opportunists, and they stay alert to changing political and social dynamics.\r\n" + "\r\n" + 
			"\r\n" + "Lasting Institutions\r\n" + 
					"\r\n" + 
					"Where a single elf or dwarf might take on the responsibility of guarding a special location or a powerful secret, humans found sacred orders and institutions for such purposes. While dwarf clans and halfling elders pass on the ancient traditions to each new generation, human temples, governments, libraries, and codes of law fix their traditions in the bedrock of history. Humans dream of immortality, but (except for those few who seek undeath or divine ascension to escape death’s clutches) they achieve it by ensuring that they will be remembered when they are gone.\r\n" + 
					"\r\n" + 
					"Although some humans can be xenophobic, in general their societies are inclusive. Human lands welcome large numbers of nonhumans compared to the proportion of humans who live in nonhuman lands.\r\n" + 
					"Exemplars of Ambition\r\n" + 
					"\r\n" + 
					"Humans who seek adventure are the most daring and ambitious members of a daring and ambitious race. They seek to earn glory in the eyes of their fellows by amassing power, wealth, and fame. More than other people, humans champion causes rather than territories or groups.\r\n" + 
					"Human Names and Ethnicities\r\n" + 
					"\r\n" + 
					"Having so much more variety than other cultures, humans as a whole have no typical names. Some human parents give their children names from other languages, such as Dwarvish or Elvish (pronounced more or less correctly), but most parents give names that are linked to their region’s culture or to the naming traditions of their ancestors.\r\n" + 
					"\r\n" + 
					"The material culture and physical characteristics of humans can change wildly from region to region. In the Forgotten Realms, for example, the clothing, architecture, cuisine, music, and literature are different in the northwestern lands of the Silver Marches than in distant Turmish or Impiltur to the east—and even more distinctive in far-off Kara-Tur. Human physical characteristics, though, vary according to the ancient migrations of the earliest humans, so that the humans of the Silver Marches have every possible variation of coloration and features.\r\n" + 
					"\r\n" + 
					"In the Forgotten Realms, nine human ethnic groups are widely recognized, though over a dozen others are found in more localized areas of Faerûn. These groups, and the typical names of their members, can be used as inspiration no matter which world your human is in.\r\n" + 
					"Calishite\r\n" + 
					"\r\n" + 
					"Shorter and slighter in build than most other humans, Calishites have dusky brown skin, hair, and eyes. They’re found primarily in southwest Faerûn.\r\n" + 
					"\r\n" + 
					"Calishite Names: (Male) Aseir, Bardeid, Haseid, Khemed, Mehmen, Sudeiman, Zasheir; (female) Atala, Ceidil, Hama, Jasmal, Meilil, Seipora, Yasheira, Zasheida; (surnames) Basha, Dumein, Jassan, Khalid, Mostana, Pashar, Rein\r\n" + 
					"Chondathan\r\n" + 
					"\r\n" + 
					"Chondathans are slender, tawny-skinned folk with brown hair that ranges from almost blond to almost black. Most are tall and have green or brown eyes, but these traits are hardly universal. Humans of Chondathan descent dominate the central lands of Faerûn, around the Inner Sea.\r\n" + 
					"\r\n" + 
					"Chondathan Names: (Male) Darvin, Dorn, Evendur, Gorstag, Grim, Helm, Malark, Morn, Randal, Stedd; (female) Arveene, Esvele, Jhessail, Kerri, Lureene, Miri, Rowan, Shandri, Tessele; (surnames) Amblecrown, Buckman, Dundragon, Evenwood, Greycastle, Tallstag\r\n" + 
					"Damaran\r\n" + 
					"\r\n" + 
					"Found primarily in the northwest of Faerûn, Damarans are of moderate height and build, with skin hues ranging from tawny to fair. Their hair is usually brown or black, and their eye color varies widely, though brown is most common.\r\n" + 
					"\r\n" + 
					"Damaran Names: (Male) Bor, Fodel, Glar, Grigor, Igan, Ivor, Kosef, Mival, Orel, Pavel, Sergor; (female) Alethra, Kara, Katernin, Mara, Natali, Olma, Tana, Zora; (surnames) Bersk, Chernin, Dotsk, Kulenov, Marsk, Nemetsk, Shemov, Starag\r\n" + 
					"Illuskan\r\n" + 
					"\r\n" + 
					"Illuskans are tall, fair-skinned folk with blue or steely gray eyes. Most have raven-black hair, but those who inhabit the extreme northwest have blond, red, or light brown hair.\r\n" + 
					"\r\n" + 
					"Illuskan Names: (Male) Ander, Blath, Bran, Frath, Geth, Lander, Luth, Malcer, Stor, Taman, Urth; (female) Amafrey, Betha, Cefrey, Kethra, Mara, Olga, Silifrey, Westra; (surnames) Brightwood, Helder, Hornraven, Lackman, Stormwind, Windrivver\r\n" + 
					"Mulan\r\n" + 
					"\r\n" + 
					"Dominant in the eastern and southeastern shores of the Inner Sea, the Mulan are generally tall, slim, and amber-skinned, with eyes of hazel or brown. Their hair ranges from black to dark brown, but in the lands where the Mulan are most prominent, nobles and many other Mulan shave off all their hair.\r\n" + 
					"\r\n" + 
					"Mulan Names: (Male) Aoth, Bareris, Ehput-Ki, Kethoth, Mumed, Ramas, So-Kehur, Thazar-De, Urhur; (female) Arizima, Chathi, Nephis, Nulara, Murithi, Sefris, Thola, Umara, Zolis; (surnames) Ankhalab, Anskuld, Fezim, Hahpet, Nathandem, Sepret, Uuthrakt\r\n" + 
					"Rashemi\r\n" + 
					"\r\n" + 
					"Most often found east of the Inner Sea and often intermingled with the Mulan, Rashemis tend to be short, stout, and muscular. They usually have dusky skin, dark eyes, and thick black hair.\r\n" + 
					"\r\n" + 
					"Rashemi Names: (Male) Borivik, Faurgar, Jandar, Kanithar, Madislak, Ralmevik, Shaumar, Vladislak; (female) Fyevarra, Hulmarra, Immith, Imzel, Navarra, Shevarra, Tammith, Yuldra; (surnames) Chergoba, Dyernina, Iltazyara, Murnyethara, Stayanoga, Ulmokina\r\n" + 
					"Shou\r\n" + 
					"\r\n" + 
					"The Shou are the most numerous and powerful ethnic group in Kara-Tur, far to the east of Faerûn. They are yellowish-bronze in hue, with black hair and dark eyes. Shou surnames are usually presented before the given name.\r\n" + 
					"\r\n" + 
					"Shou Names: (Male) An, Chen, Chi, Fai, Jiang, Jun, Lian, Long, Meng, On, Shan, Shui, Wen; (female) Bai, Chao, Jia, Lei, Mei, Qiao, Shui, Tai; (surnames) Chien, Huang, Kao, Kung, Lao, Ling, Mei, Pin, Shin, Sum, Tan, Wan\r\n" + 
					"Tethyrian\r\n" + 
					"\r\n" + 
					"Widespread along the entire Sword Coast at the western edge of Faerûn, Tethyrians are of medium build and height, with dusky skin that tends to grow fairer the farther north they dwell. Their hair and eye color varies widely, but brown hair and blue eyes are the most common. Tethyrians primarily use Chondathan names.\r\n" + 
					"Turami\r\n" + 
					"\r\n" + 
					"Native to the southern shore of the Inner Sea, the Turami people are generally tall and muscular, with dark mahogany skin, curly black hair, and dark eyes.\r\n" + 
					"\r\n" + 
					"Turami Names: (Male) Anton, Diero, Marcon, Pieron, Rimardo, Romero, Salazar, Umbero; (female) Balama, Dona, Faila, Jalana, Luisa, Marta, Quara, Selise, Vonda; (surnames) Agosto, Astorio, Calabra, Domine, Falone, Marivaldi, Pisacar, Ramondo";
	
	private String Resistance ="No Racial Resistance";
	
public Human() {
		
	}
		//////////////////   setters and getters
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
				
			default :
				System.out.println("There are no sub races for Humans");
				break;
					
				
			}
		}
	
}


