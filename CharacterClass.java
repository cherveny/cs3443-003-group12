import java.lang.*;
import java.util.HashMap;
import java.util.Set;

public class CharacterClass {
    ////////////////////
    // CONSTANTS      //
    ////////////////////
    private static final Integer levelCap = 5;


    //////////////////
    //  data        //
    //////////////////
    // data set by character class choice

    // Class Choice
    private static String classChoice = "";

    // character type descriptions for choosing a character type
    private static HashMap<String,String> descriptions  = new HashMap<String,String>();

    // what weapon proficencies bonuses are received
    private static Integer[] weaponProficiencies = new Integer[levelCap];

    // hit dice
    private static Integer hitDice = 0;

    // Start hit points
    private static Integer startHP = 0;

    // wizard spells [clevel] [spell level] contains # of slots, 0 is cantrip, 1 is 1, 2 is 2, etc
    private static Integer[][] wizardSpells = new Integer[levelCap][levelCap];

    // druid spells [clevel] [spell level] contains # of slots 0 is cantrip, 1 is 1, 2 is 2, etc
    private static Integer[][] druidSpells = new Integer[levelCap][levelCap];

    // cleric spells [clevel] [spell level] contains # of slots 0 is cantrip, 1 is 1, 2 is 2, etc
    private static Integer[][] clericSpells = new Integer[levelCap][levelCap];

    // ability score improvements, array of boolean, true at levels with an improvement
    private static Boolean[] abilityImprovement = new Boolean[levelCap];

    // weapon proficiencies
    private static String weaponProfList = "";

    // armor proficiencies
    private static String armorProfList = "";

    // proficient saves
    private static String profSaves = "";

    // per level features
    private static String[] features = new String[levelCap];

    // BARBARIAN ONLY: Rages
    private static Integer[] rages = new Integer[levelCap];

    // BARBARIAN ONLY: RageDamage
    private static Integer[] rageDamage = new Integer[levelCap];


    //////////////////////
    // display helpers  //
    //////////////////////
    // methods that chould/should help with display

    public static String getDescription(String name) throws invalidCharacterClass {
        // returns the description of a character class
        // should be used when user is trying to decide upon a class
        // invalidCharacterClass: thrown if an unimplemented character class is picked
        if (name.isBlank() || !descriptions.containsKey(name) ) {
            throw new invalidCharacterClass("Character class " + name + " undefined");
        }
        return (descriptions.get(name));
    }


    ///////////////////
    // getters       //
    ///////////////////
    // for retrieving the data

    // SEE: getDescription() in display helpers section

    public static String getClassChoice() {
        // After a class is chosen, remember the choice
        return classChoice;
    }

    public static String getProfSaves() {
        // gets list of proficient saves
        return profSaves;
    }

    public static String[] getFeatures() {
        // gets features, per level, 0 = 1, 1 = 2
        return features;
    }

    public static String getArmorProfList() {
        // get list of proficient armors
        return armorProfList;
    }

    public Integer[][] getWizardSpells() {
        // return wizard spells, [clevel][spelllevel] = slots, level 0 = cantrip
        return wizardSpells;
    }

    public Integer[][] getDruidSpells() {
        // return druid spells, [clevel][spelllevel] = slots
        return druidSpells;
    }

    public  Integer[][] getClericSpells() {
        // return druid spells, [clevel][spelllevel] = slots
        return clericSpells;
    }

    public static Integer getStartHP() {
        // get the starting HP ammount for the character
        return startHP;
    }

    public static Integer[] getWeaponProficiencies() {
        // returns an array of proficiency bonuses at each level
        return weaponProficiencies;
    }

    public static String listClasses() {
        //  List available classes for use.
        String classList = "";

        Set<String> keys = descriptions.keySet();
        for(String key: keys){

            if (classList.isEmpty()) {
                classList = key;
            } else
                classList = classList + " , " + key;
        }
        return (classList);
    }

    public static Integer[] getRages() {
        // BARBARIAN ONLY:  get the number or rages, per level
        return rages;
    }

    public static Integer[] getRageDamage() {
        // BARBARIAN ONLY:  get the number or rages, per level
        return rageDamage;
    }

    public static Integer getHitDice() {
        // returns the die roll to use to add hit points on level up
        return hitDice;
    }

    public static Boolean[] getAbilityImprovement() {
        // true if that level has an ability improvements
        return abilityImprovement;
    }



    ///////////////////
    // setters       //
    ///////////////////
    // for changing the data, primarily used by the character class methods below

    public static void setWeaponProficiencies(Integer[] weaponProficiencies) {
        // sets the weapon proficiency bonus, per level
        CharacterClass.weaponProficiencies = weaponProficiencies;
    }

    private static void setClassChoice(String classChoice) {
        // once a character class is chosen, set it
        CharacterClass.classChoice = classChoice;

    }

    public static void setProfSaves(String profSaves) {
        // sets proficient saves list
        CharacterClass.profSaves = profSaves;
    }

    public static void setWeaponProfList(String weaponProfList) {
        // set list of proficient weapons
        CharacterClass.weaponProfList = weaponProfList;
    }
    public static void setArmorProfList(String armorProfList) {
        // set list of proficient armors
        CharacterClass.armorProfList = armorProfList;
    }

    public static void setRages(Integer[] rages) {
        // BARBARIAN ONLY: set how many rages per level
        CharacterClass.rages = rages;
    }

    public static void setRageDamage(Integer[] rageDamage) {
        // BARBARIAN ONLY: set how much damage during rage, per level
        CharacterClass.rageDamage = rageDamage;
    }

    public static void setHitDice(Integer hitDice) {
        // sets the die used for generating hit points each level
        CharacterClass.hitDice = hitDice;
    }

    public static void setStartHP(Integer startHP) {
        // set the starting HP value
        CharacterClass.startHP = startHP;
    }

    public static void setWizardSpells(Integer[][] wizardSpells) {
        // set wizard spells, [clevel][spelllevel] = slots
        CharacterClass.wizardSpells = wizardSpells;
    }

    public static void setDruidSpells(Integer[][] druidSpells) {
        // set druid spells, [clevel][spelllevel] = slots
        CharacterClass.druidSpells = druidSpells;
    }

    public static void setClericSpells(Integer[][] clericSpells) {
        // set cleric spells, [clevel][spelllevel] = slots
        CharacterClass.clericSpells = clericSpells;
    }

    public static void setAbilityImprovement(Boolean[] abilityImprovement) {
        // true if that level has an ability improvement
        CharacterClass.abilityImprovement = abilityImprovement;
    }

    public static void setFeatures(String[] features) {
        // sets features, per level, 0 = 1, 1 = 2
        CharacterClass.features = features;
    }

    /////////////////////////////
    // character class methods //
    /////////////////////////////
    // one method per class.  once selected, will set all values of character class, via setters, to the values
    // corresponding to the class

    public static void chooseCharacterClass(String name) throws invalidCharacterClass {
        // validates character choice as one implemented, then sets choice.  then calls appropriate method to set values
        if (name.isBlank() || !descriptions.containsKey(name) ) {
            throw new invalidCharacterClass("Character class " + name + " undefined");
        }

        switch (name) {
            case "Barbarian":
                barbarianClass();
                break;
            default:
                throw new invalidCharacterClass("Character class " + name + " undefined");
        }

    }

    public static void barbarianClass() {
        // set all values to match barbarian being selected
        Integer[] profs = new Integer[levelCap];
        Integer[] rages = new Integer[levelCap];
        Integer[] rageDamage = new Integer[levelCap];
        Integer[]   spells = {-1,-1,-1,-1,-1};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]   feature = new String[levelCap];

        try {
            setClassChoice("Barbarian");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            profs[i]=2;
        }

        for (int i = 0;i<levelCap;i++) {
            profs[i]=2;
            rageDamage[i]=2;
        }

        for (int i = 0;i<levelCap;i++) {
            // levels 1 and 2 get 2, 3,4 and 5 get 3.
            rages[i]=2;
            if (i>1) rages[i]++;
        }


        for(int i=0;i<levelCap;i++) {
            bigSpells[i] = spells;
        }

        feature[0]="Rage, Unarmored Defense";
        feature[1]="Reckless Attack, Danger Sense";
        feature[2]="Primal Path";
        feature[3]="Ability Score Improvement";
        feature[4]="Extra Attack,Fast Movement";

        setFeatures(feature);
        setWeaponProfList("Simple weapons, martial weapons");
        setArmorProfList("Light armor, medium armor, shields");
        setProfSaves( "Strength, Constitution");
        setAbilityImprovement(abilityImp);
        setWizardSpells(bigSpells);
        setDruidSpells(bigSpells);
        setClericSpells(bigSpells);
        setRageDamage(rageDamage);
        setRages(rages);
        setWeaponProficiencies(profs);
        setHitDice(12);
        setStartHP(12);
        //System.out.println(weaponProficiencies[4]);
        //System.out.println(wizardSpells[4][2]);
        //System.out.println(features[2]);
    }

    ////////////////////////////////
    // setters for initialization //
    ////////////////////////////////
    // for setters used to initialize later data
    // in general, only used in constructor

    public CharacterClass(){
        // CONSTRUCTOR
        initCreateDescriptions();
    }
    private void initAddClassDesc(String name, String desc) {
        // allows for an addition of a character class and description to the description Hashmap
        descriptions.put(name,desc);
    }

    private void initCreateDescriptions() {
        // populate all the character type descriptions
        initAddClassDesc("Barbarian","A tall human tribesman strides through a blizzard, draped in fur and hefting his axe. " +
                "He laughs as he charges toward the frost giant who dared poach his people’s elk herd.\n" +
                "\n" +
                "A half-orc snarls at the latest challenger to her authority over their savage tribe, ready to break " +
                "his neck with her bare hands as she did to the last six rivals.\n" +
                "\n" +
                "Frothing at the mouth, a dwarf slams his helmet into the face of his drow foe, then turns to drive " +
                "his armored elbow into the gut of another.\n" +
                "\n" +
                "These barbarians, different as they might be, are defined by their rage: unbridled, unquenchable, and " +
                "unthinking fury. More than a mere emotion, their anger is the ferocity of a cornered predator, the " +
                "unrelenting assault of a storm, the churning turmoil of the sea.\n" +
                "\n" +
                "For some, their rage springs from a communion with fierce animal spirits. Others draw from a roiling " +
                "reservoir of anger at a world full of pain. For every barbarian, rage is a power that fuels not just " +
                "a battle frenzy but also uncanny reflexes, resilience, and feats of strength.\n" +
                "\n" +
                "Primal Instinct\n" +
                "People of towns and cities take pride in how their civilized ways set them apart from animals, as if " +
                "denying one’s own nature was a mark of superiority. To a barbarian, though, civilization is no virtue, " +
                "but a sign of weakness. The strong embrace their animal nature—keen instincts, primal physicality, and" +
                " ferocious rage. Barbarians are uncomfortable when hedged in by walls and crowds. They thrive in the" +
                " wilds of their homelands: the tundra, jungle, or grasslands where their tribes live and hunt.\n" +
                "\n" +
                "Barbarians come alive in the chaos of combat. They can enter a berserk state where rage takes over, " +
                "giving them superhuman strength and resilience. A barbarian can draw on this reservoir of fury only a " +
                "few times without resting, but those few rages are usually sufficient to defeat whatever threats" +
                " arise.\n" +
                "\n" +
                "A Life of Danger\n" +
                "Not every member of the tribes deemed “barbarians” by scions of civilized society has the barbarian " +
                "class. A true barbarian among these people is as uncommon as a skilled fighter in a town, and he or" +
                " she plays a similar role as a protector of the people and a leader in times of war. Life in the wild " +
                "places of the world is fraught with peril: rival tribes, deadly weather, and terrifying monsters. " +
                "Barbarians charge headlong into that danger so that their people don’t have to.\n" +
                "\n" +
                "Their courage in the face of danger makes barbarians perfectly suited for adventuring. Wandering is " +
                "often a way of life for their native tribes, and the rootless life of the adventurer is little " +
                "hardship for a barbarian. Some barbarians miss the close-knit family structures of the tribe, but" +
                " eventually find them replaced by the bonds formed among the members of their adventuring parties.");
    }



}
