
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

	//////////   E Q U I P M E N T    S T A T S   ////////////
	private int CP;
	private int SP;
	private int EP;
	private int GP;
	private int PP;
	private String equipment = "";
	
	//class here
	//race here
	
	
	//////////   S A V I N G     T H R O W S   ////////////
	
	
	//////////   A T T A C K S    &    S P E L L C A S T I N G   ////////////
	
	
	//////////   G E N E R A L    S T A T S     &    I N F O  ////////////
	private int passiveWisdom;
	private int inspiration;
	private int proficiencyBonus;
	private String profiNLang = "";
	private String playerName = "";
	private String faction = "";
	private String alignment = "";
	private String characterName = "";
	private int exp;
	private int level;
	
	
	//////////   B A S E     6     S T A T S   ////////////
	private int strength = 0;
	private int dexterity = 0;
	private int constitution = 0;
	private int intelligence = 0;
	private int wisdom = 0;
	private int charisma = 0;
	
	
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
	
	
}
