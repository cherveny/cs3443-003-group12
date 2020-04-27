import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/***********************************************
 *  This class is meant to store all the info for a single character
 *  it'll be handled as an object for multiple characters
 *  
 * @author Mazen Shaban
 *
 */
public class Character {
	
	
	
	//////////   B A T T L E  S T A T S   ////////////
	private int HP;
	private int curHP;
	private int tempHP;
	private int speed;
	private int AC;
	private int initiative;
	private int dsSuccess;
	private int dsFailures;
	private int HitDice;
	//////////   E Q U I P M E N T    S T A T S   ////////////
/*	private int CP;
	private int SP;
	private int EP;				Not enough time to implement equipment
	private int GP;
	private int PP;
	private String equipment = "";
	*/
	private String armor = "";
	
	String trait = "";
	private ArrayList<skill> chosenSkills = new ArrayList<skill>();
	private ArrayList<Spell> SpellList = new ArrayList<Spell>();
	CharacterClass cClass;
	Race race;
	int raceChoice;
	

	

	//////////   S A V I N G     T H R O W S   ////////////
	private int strengthSave = 0;
	private int dexteritySave  = 0;
	private int constitutionSave = 0;
	private int intelligenceSave = 0;
	private int wisdomSave = 0;
	private int charismaSave = 0;
	
	//////////   A T T A C K S    &    S P E L L C A S T I N G   ////////////
	
	
	//////////   G E N E R A L    S T A T S     &    I N F O  ////////////
	private int passiveWisdom;
	private int inspiration;
	private int proficiencyBonus;
	private String chosenClass ="";
	private String playerName = "";

	private String alignment = "";
	private String characterName = "";

	private int level;
	
	
	//////////   B A S E     6     S T A T S        +      modifiers    ////////////
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	private int strengthMod = 0;
	private int dexterityMod = 0;
	private int constitutionMod = 0;
	private int intelligenceMod = 0;
	private int wisdomMod = 0;
	private int charismaMod = 0;
	
	//////////  S K I L L S  ////////////
	private int acrobatics;
	private int animalHandling;
	private int arcana;
	private int athletics;
	private int deception;
	private int history;
	private int insight;
	private int intimidation;
	private int investigation;
	private int medicine;
	private int nature;
	private int perception;
	private int performance;
	private int persuasion;
	private int religion;
	private int sleightOfHands;
	private int stealth;
	private int survival;
	
	
	//////////   C O N S T R U C T O R   ///////////
	public Character()
	{
		this.strength = 15;
		this.dexterity = 14;
		this.constitution = 13;
		this.intelligence = 12;
		this.wisdom = 10;
		this.charisma = 8;
		try {
		File f = new File("Skill Initializer");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String rline;
		while ((rline = br.readLine()) != null) {
			skill temp = new skill(rline);
			chosenSkills.add(temp);
		}
		br.close();
		fr.close();
		}catch (IOException e) {
			System.out.println("File Error: Initializing character skills FAILED");
		}
	}
		
	
	
	
	//////////   B A S E     6     S T A T S     S E T T E R S   ///////////
	public void setStrength( int str )
	{
		this.strength = str;
	}
	
	public void setDexterity( int dex )
	{
		this.dexterity = dex;
	}
	
	public void setConstitution( int constitution)
	{
		this.constitution = constitution;
	}
	
	public void setIntelligence( int intelli)
	{
		this.intelligence = intelli;
	}	
	
	public void setWisdom( int wis)
	{
		this.wisdom = wis;
	}
	
	public void setCharisma( int charisma)
	{
		this.charisma = charisma;
	}
	
	
	////////////  B A S E     6     S T A T S    G E T T E R S  /////////////
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
	
	
	//////////  S K I L L S      S E T T E R S   ///////////
	public void setAcrobatics( int acro )
	{
		this.acrobatics = acro;
		
	}

	public void setAnimalHandling( int aniHan )
	{
		this.animalHandling = aniHan;
	}

	public void setArcana( int arca)
	{
		this.arcana = arca;
	}

	public void setAthletics( int athl)
	{
		this.athletics = athl;
	}	

	public void setDeception( int dec)
	{
		this.deception = dec;
	}

	public void setHistory( int his)
	{
		this.history = his;
	}
	
	public void setInsight( int insi )
	{
		this.insight = insi;
	}

	public void setIntimidation( int inti )
	{
		this.intimidation = inti;
	}

	public void setInvestigation( int inves)
	{
		this.investigation = inves;
	}

	public void setMedicine( int medi)
	{
		this.medicine = medi;
	}	

	public void setNature( int nat)
	{
		this.nature = nat;
	}

	public void setPerception( int percep)
	{
		this.perception = percep;
	}
	
	public void setPerformance( int perform )
	{
		this.performance = perform;
	}

	public void setPersuasion( int persua )
	{
		this.persuasion = persua;
	}

	public void setReligion( int reli)
	{
		this.religion = reli;
	}

	public void setSleightOfHands( int soh)
	{
		this.sleightOfHands = soh;
	}	

	public void setStealth( int stel)
	{
		this.deception = stel;
	}

	public void setSurvival( int surv)
	{
		this.survival = surv;
	}
	
	
	////////////  S K I L L S     G E T T E R S  /////////////
	public int getAcrobatics()
	{
		return this.acrobatics;
	}

	public int getAnimalHandling()
	{
		return this.animalHandling;
	}

	public int getArcana()
	{
		return this.arcana;
	}

	public int getAthletics()
	{
		return this.athletics;
	}
	
	public int getDeception()
	{
		return this.deception;
	}

	public int getHistory()
	{
		return this.history;
	}
	
	public int getInsight()
	{
		return this.insight;
	}

	public int getIntimidation()
	{
		return this.intimidation;
	}

	public int getInvestigation()
	{
		return this.investigation;
	}

	public int getMedicine()
	{
		return this.medicine;
	}
	
	public int getNature()
	{
		return this.nature;
	}

	public int getPerception()
	{
		return this.perception;
	}
	
	public int getPerformance()
	{
		return this.performance;
	}
	
	public int getPersuasion()
	{
		return this.persuasion;
	}

	public int getReligion()
	{
		return this.religion;
	}

	public int getSleightOfHands()
	{
		return this.sleightOfHands;
	}
	
	public int getStealth()
	{
		return this.stealth;
	}

	public int getSurvival()
	{
		return this.survival;
	}
	
	////////////////   B A T T L E     S T A T S    S E T T E R S    &    G E T T E R S    /////////////////
	

	public int getHP() {
		return HP;
	}

	public void setHP( int hp) {
		HP = hp;
	}
	
	public int getCurHP() {
		return curHP;
	}
	
	public void setCurHP ( int curhp) {
		curHP = curhp;
	}
	
	public int getTempHP() {
		return tempHP;
	}
	
	public void setTempHP(int temphp) {
		tempHP = temphp;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int spee) {
		speed = spee;
	}
	
	public int getAC() {
		return AC;
	}
	
	public void setAC(int ac) {
		AC = ac;
	}
	
	public int getInitiative() {
		return initiative;
	}
	
	public void setInitiative( ) {
		initiative = dexterityMod;
	}
	
	public int getDSsuccess() {
		return dsSuccess;
	}
	
	public void setDSsuccess( int dsS) {
		dsSuccess= dsS;
	}
	public int getDSfailures() {
		return dsFailures;
	}
	
	public void setDSfailures( int dsF) {
		dsFailures = dsF;
	}



	public int getPassWisdom() {
		return passiveWisdom;
	}
	
	public void setPassiveWisdom(int pasWis) {
		passiveWisdom = pasWis;
	}
	
	public int getInspiration() {
		return inspiration;
	}
	
	public void setInspiration( int inspir) {
		inspiration = inspir;
	}
	
	public int getProfBonus() {
		return proficiencyBonus;
	}
	
	public void setProfBonus( int bon) {
		proficiencyBonus =bon;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String name) {
		playerName = name;
	}
	
	public String getAlignment() {
		return alignment;
	}
	
	public void setAlignment(String align) {
		alignment = align;
	}
	
	public String getCharName() {
		return characterName;
	}
	
	public void setCharName( String name) {
		characterName = name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel() {
		// implement by grabbing level from class level
	}
	
	public void setLevel(int lvl) {
		level = lvl;
	}
	public void setRaceChoice(int c) {
		raceChoice = c;
	}
	public int getRaceChoice() {
		return raceChoice;
	}
	
	public void setChosenClass(String chosen) {
		chosenClass = chosen;
	}
	public String getChosenClass() {
		return chosenClass;
	}
	
	public void setArmor(String s) {
		armor = s;
	}
	public String getArmor() {
		return armor;
	}
	public void setAC(String s) {
		
		if ( s.contains("Padded")) {
			AC = 11 + dexterityMod;
		}
		else if ( s.contains("Leather")) {
			AC = 11 + dexterityMod;
		}
		else if ( s.contains("Studded")) {
			AC = 12 + dexterityMod;
		}
		else if ( s.contains("Hide")) {
			AC = 12 + dexterityMod;
			if ( AC > 14) {
				AC = 14;
			}	
		}
		else if ( s.contains("Chain shirt")) {
			AC = 13 + dexterityMod;
			if ( AC > 15) {
				AC = 15;
			}
		}
		else if ( s.contains("Scale")) {
			AC = 14 + dexterityMod;
			if ( AC > 16) {
				AC = 16;
			}
		}
		else if ( s.contains("Breastplate")) {
			AC = 14 + dexterityMod;
			if ( AC > 16) {
				AC = 16;
			}
		}
		else if ( s.contains("Half")) {
			AC = 15 + dexterityMod;
			if ( AC > 17) {
				AC = 17;
			}
		}
		else if ( s.contains("Ring")) {
			AC = 14;
		}
		else if ( s.contains("Chain mail")) {
			AC = 16;
		}
		else if ( s.contains("Splint")) {
			AC = 17;
		}
		else if ( s.contains("Plate")) {
			AC = 18;
		}
		else {
			AC = 11 + dexterityMod;
		}
	}
	////////////////////       Methods other than setters and getters      //////////////////////////////////
	public void chooseClass() {
		cClass = new CharacterClass(chosenClass);
		try {
			cClass.chooseCharacterClass(chosenClass);
		} catch (invalidCharacterClass e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void chosenSkill(String name) {
		for (int i = 0; i < chosenSkills.size(); i++) {
			if (chosenSkills.get(i).getSkillName().contains(name)) {
				chosenSkills.get(i).setChoice();
			}
		}
	}
	public void chooseRace(int choice) {
		raceChoice = choice;
	switch (choice) {
		
		case 1:
			race = new Dragonborn();
			break;
		case 2:
			race = new Dwarf();
			break;
		case 3:
			race = new Elf();
			break;
		case 4:
			race = new Gnome();
			break;
		case 5:
			race = new HalfElf();
			break;
		case 6:
			race = new Halfling();
			break;
		case 7:
			race = new HalfOrc();
			break;
		case 8:
			race = new Human();
			break;
		case 9:
			race = new Tiefling();
			break;
		default :
			System.out.println("Unknown Class");
			break;
				
			
		}
		
	}
	
	 void addRaceinfo() {
		this.strength = this.strength + race.getStrength(); 
		this.dexterity = this.dexterity + race.getDexterity();
		this.constitution = this.constitution + race.getConstituition();
		this.intelligence = this.intelligence + race.getIntelligence();
		this.wisdom = this.wisdom + race.getWisdom();
		this.charisma = this.charisma + race.getCharisma();
		this.speed = race.getSpeed();
		this.trait = race.getTrait();
		
		
	}
	 
	 void abilityModifiers() {
		 int minus;
		 
		 minus = strength - 10;
		 strengthMod = (int) Math.floor(((double )minus/2));
		 
		 minus = dexterity - 10;
		 dexterityMod = (int) Math.floor(((double )minus/2));
		 
		 minus = constitution - 10;
		 constitutionMod = (int) Math.floor(((double )minus/2));
		 
		 minus = intelligence - 10;
		 intelligenceMod = (int) Math.floor(((double )minus/2));
		 
		 minus = wisdom - 10;
		 wisdomMod = (int) Math.floor(((double )minus/2));
		 
		 minus = charisma - 10;
		 charismaMod = (int) Math.floor(((double )minus/2));
	 }
	 
	 public void setSavingThrows ( String s) {
		
		 if (s.contains("Strength")) {
			 strengthSave = strengthMod + proficiencyBonus;
		 }
		 if (s.contains("Dexterity")) {
			 dexteritySave = dexterityMod + proficiencyBonus;
		 }
		 if (s.contains("Constitution")) {
			 constitutionSave = constitutionMod + proficiencyBonus;
		 }
		 if (s.contains("Intelligence")) {
			 intelligenceSave = intelligenceMod + proficiencyBonus;
		 }
		 if (s.contains("Sisdom")) {
			 wisdomSave = wisdomMod + proficiencyBonus;
		 }
		 if (s.contains("Charisma")) {
			 charismaSave = charismaMod + proficiencyBonus;
		 }
	 }
	public void createHP() {
		HP = cClass.getStartHP() + constitutionMod;
		HitDice = cClass.getHitDice();
	}
	
	public void levelUP() {
		HP = HP + DiceRoll.DiceThrow(HitDice);
		level = level +1;
		///////////////////////////      FILL OUT FOR LEVEL UP      ***************************************************************
		
	}
	
	public void addSpell(Spell s) {
		SpellList.add(s);
	}
	
	public ArrayList<Spell> getSpellList() {
		return SpellList;
	}
	
	public void addSpell(String name, int lvl) {
		SpellList.add(SpellManager.findSpell(name, lvl));
	}
	
	public void setSkills() {
		
		for (int i = 0 ; i < chosenSkills.size(); i++) {
			if (chosenSkills.get(i).getSkillName().contains("Acrobatic")) {
				acrobatics = dexterityMod;
				if (chosenSkills.get(i).hasChoice()) {
					acrobatics = acrobatics + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Animal")) {
				animalHandling = wisdomMod;
				if (chosenSkills.get(i).hasChoice()) {
					animalHandling = animalHandling + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Arcan")) {
				arcana = intelligenceMod;
				if (chosenSkills.get(i).hasChoice()) {
					arcana = arcana + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Athle")) {
				athletics = strengthMod;
				if (chosenSkills.get(i).hasChoice()) {
					athletics = athletics + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Deception")) {
				deception = charismaMod;
				if (chosenSkills.get(i).hasChoice()) {
					deception = deception + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("History")) {
				history = intelligenceMod;
				if (chosenSkills.get(i).hasChoice()) {
					history = history + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Insight")) {
				insight = wisdomMod;
				if (chosenSkills.get(i).hasChoice()) {
					insight = insight + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Intimidation")) {
				intimidation = charismaMod;
				if (chosenSkills.get(i).hasChoice()) {
					intimidation = intimidation + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Investigation")) {
				investigation = intelligenceMod;
				if (chosenSkills.get(i).hasChoice()) {
					investigation = investigation + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Medi")) {
				medicine = wisdomMod;
				if (chosenSkills.get(i).hasChoice()) {
					medicine = medicine + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Nature")) {
				nature = intelligenceMod;
				if (chosenSkills.get(i).hasChoice()) {
					nature = nature + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Percep")) {
				perception = wisdomMod;
				if (chosenSkills.get(i).hasChoice()) {
					perception = perception + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Perform")) {
				performance = charismaMod;
				if (chosenSkills.get(i).hasChoice()) {
					performance = performance + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Persuas")) {
				persuasion = charismaMod;
				if (chosenSkills.get(i).hasChoice()) {
					persuasion = persuasion + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Religion")) {
				religion= intelligenceMod;
				if (chosenSkills.get(i).hasChoice()) {
					religion = religion + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Sleight")) {
				sleightOfHands = dexterityMod;
				if (chosenSkills.get(i).hasChoice()) {
					sleightOfHands = sleightOfHands + proficiencyBonus;
				}
			}
			
			if (chosenSkills.get(i).getSkillName().contains("Stealth")) {
				stealth = dexterityMod;
				if (chosenSkills.get(i).hasChoice()) {
					stealth = stealth + proficiencyBonus;
				}
			}
			if (chosenSkills.get(i).getSkillName().contains("Surviv")) {
				survival = wisdomMod;
				if (chosenSkills.get(i).hasChoice()) {
					survival = survival + proficiencyBonus;
				}
			}
		}
	}
	
	
}

