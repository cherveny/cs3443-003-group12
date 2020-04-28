import java.lang.*;
import java.util.HashMap;
import java.util.Set;

public class CharacterClass {
    ////////////////////
    // CONSTANTS      //
    ////////////////////
    public static final Integer levelCap = 5;
    public static final Integer profCap = 10;

    // character type descriptions for choosing a character type
    // SEMI-CONSTANT.  Created during constructor.  not touched afterwards
    private static HashMap<String,String> descriptions  = new HashMap<String,String>();

    //////////////////
    //  data        //
    //////////////////
    // data set by character class choice

    // Class Choice
    private static String classChoice = "";

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
    private static String[] weaponProfList = new String[profCap];

    // armor proficiencies
    private static String[] armorProfList = new String[profCap];

    // proficient saves
    private static String[] profSaves = new String[profCap];

    // per level features
    private static String[] features = new String[levelCap];

    // BARBARIAN ONLY: Rages
    private static Integer[] rages = new Integer[levelCap];

    // BARBARIAN ONLY: RageDamage
    private static Integer[] rageDamage = new Integer[levelCap];

    // THEIF ONLY: sneakAttack
    private static String[] sneakAttack = new String[levelCap];


    //////////////////////
    // display helpers  //
    //////////////////////
    // methods that chould/should help with display

    public static void clear() {
        // used if a user selected a class, but changed their mind.  Resets all values to init
        classChoice = "";
        Integer[]   profs = {0,0,0,0,0};
        Integer[]   spells = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,false,false};
        String[]    feature = new String[levelCap];
        String[]    profStrings =  new String[profCap];

        for(int i=0;i<levelCap;i++) {
            // set all spell slots to 0 for no spells
            bigSpells[i] = spells;
        }

        for(int i=0;i<profCap; i++) {
            profStrings[i] = "";
        }

        for(int i=0;i<levelCap;i++) {
            // set all features to empty string
            feature[i] = "";
        }

        setWeaponProficiencies(profs);
        setWizardSpells(bigSpells);
        setClericSpells(bigSpells);
        setFeatures(feature);
        setWeaponProficiencies(spells);
        setWeaponProfList(profStrings);
        setArmorProfList(profStrings);
        setProfSaves(profStrings);
        setAbilityImprovement(abilityImp);
        setRages(spells);
        setRageDamage(spells);
        setHitDice(0);
        setStartHP(0);
        setSneakAttack(feature);
    } // end clear

    public static String getDescription(String name) throws invalidCharacterClass {
        // returns the description of a character class
        // should be used when user is trying to decide upon a class
        // invalidCharacterClass: thrown if an unimplemented character class is picked
        if (name.equals("") || !descriptions.containsKey(name) ) {
            throw new invalidCharacterClass("Character class " + name + " undefined");
        }
        return (descriptions.get(name));
    } // end getDescription

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
    } // end listClasses


    ///////////////////
    // getters       //
    ///////////////////
    // for retrieving the data

    // SEE: getDescription() in display helpers section
    // SEE: listClasses() in display helpers section


    public static String getClassChoice() {
        // After a class is chosen, remember the choice
        return classChoice;
    }

    public static String[] getFeatures() {
        // gets features, per level, 0 = 1, 1 = 2
        return features;
    }

    public static String[] getProfSaves() {
        // gets list of proficient saves
        return profSaves;
    }

    public static String[] getWeaponProfList() {
        return weaponProfList;
    }

    public static String[] getArmorProfList() {
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

    public static String[] getSneakAttack() {
        // THEIF ONLY
        return sneakAttack;
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

    public static void setProfSaves(String[] profSaves) {
        // sets proficient saves list
        CharacterClass.profSaves = profSaves;
    }

    public static void setWeaponProfList(String[] weaponProfList) {
        // set list of proficient weapons
        CharacterClass.weaponProfList = weaponProfList;
    }
    public static void setArmorProfList(String[] armorProfList) {
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

    public static void setSneakAttack(String[] sneakAttack) {
        // THIEF ONLY
        CharacterClass.sneakAttack = sneakAttack;
    }

    /////////////////////////////
    // character class methods //
    /////////////////////////////
    // one method per class.  once selected, will set all values of character class, via setters, to the values
    // corresponding to the class

    public static void chooseCharacterClass(String name) throws invalidCharacterClass {
        // validates character choice as one implemented, then sets choice.  then calls appropriate method to set values
        if (name.equals("") || !descriptions.containsKey(name) ) {
            throw new invalidCharacterClass("Character class " + name + " undefined");
        }

        switch (name) {
            case "Barbarian":
                barbarianClass();
                break;
            case "Wizard":
                wizardClass();
                break;
            case "Cleric":
                clericClass();
                break;
            case "Rogue":
                rogueClass();
                break;
            case "Fighter":
                fighterClass();
            default:
                throw new invalidCharacterClass("Character class " + name + " undefined");
        }

    } // end chooseCharacterClass

    public static void wizardClass() {
        // set all values to match wizard being selected
        Integer[]   profs = new Integer[levelCap];
        Integer[]   spells = {0,0,0,0,0};
        Integer[]   spellsC = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Integer[][] bigSpellsC = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]    feature = new String[levelCap];
        String[]    wProf = new String[profCap];
        String[]    aProf = new String[profCap];
        String[]    sProf = new String[profCap];
        String[]    sneak = new String[levelCap];

        try {
            setClassChoice("Wizard");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            // load up proficiency bonus levels
            if(i==4)
                profs[i]=3;
            else
                profs[i]=2;
        }

        for(int i=0;i<levelCap;i++) {
            // set all spell slots, bigSpells index 0 = 1, 1 = 2, spells indexed 0 =  camtrip, 1=level 1
            switch(i) {
                case 0:
                    spells[0] = 3;
                    spells[1] = 2;
                    break;
                case 1:
                    spells[0] = 3;
                    spells[1] = 3;
                    break;
                case 2:
                    spells[0] = 3;
                    spells[1] = 4;
                    spells[2] = 2;
                    break;
                case 3:
                    spells[0] = 4;
                    spells[1] = 4;
                    spells[2] = 3;
                    break;
                case 4:
                    spells[0] = 4;
                    spells[1] = 4;
                    spells[2] = 3;
                    spells[2] = 2;
                    break;
            } // end switch
            bigSpells[i] = spells;
        }


        for(int i=0;i<levelCap;i++) {
            // set all spell slots to -1 for no spells of cleric
            bigSpellsC[i] = spellsC;
            sneak[i] = "";
        }

        // set features per level
        feature[0] = "Spellcasting, Arcane Recovery";
        feature[1] = "Arcane Tradition";
        feature[2] = "-";
        feature[3] = "Ability Score Improvement";
        feature[4] = "-";

        aProf[0] = "None";

        wProf[0]="Daggers";
        wProf[1]="Darts";
        wProf[2]="Slings";
        wProf[3]="Quarterstaffs";
        wProf[4]="Light Crossbows";

        sProf[0]="Intelligence";
        sProf[1]="Wisdom";

        setWeaponProficiencies(profs);
        setWizardSpells(bigSpells);
        //setDruidSpells(bigSpells);
        setClericSpells(bigSpellsC);
        setFeatures(feature);

        setArmorProfList(aProf);

        //setWeaponProfList("Daggers, darts, slings, quarterstaffs, light crossbows");
        setWeaponProfList(wProf);
        //setProfSaves( "Intelligence, Wisdom");
        setProfSaves(sProf);
        setHitDice(6);
        setStartHP(6);
        setAbilityImprovement(abilityImp);
        setSneakAttack(sneak);

    } //end wizardClass

    public static void clericClass() {
        // set all values to match cerlic being selected
        Integer[]   profs = new Integer[levelCap];
        Integer[]   spells = {0,0,0,0,0};
        Integer[]   spellsW = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Integer[][] bigSpellsW = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]    feature = new String[levelCap];
        String[]    wProf = new String[profCap];
        String[]    aProf = new String[profCap];
        String[]    sProf = new String[profCap];
        String[]    sneak = new String[levelCap];

        try {
            setClassChoice("Cleric");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            // load up proficiency bonus levels
            if(i==4)
                profs[i]=3;
            else
                profs[i]=2;
        }

        for(int i=0;i<levelCap;i++) {
            // set all spell slots, bigSpells index 0 = 1, 1 = 2, spells indexed 0 =  camtrip, 1=level 1
            switch(i) {
                case 0:
                    spells[0] = 3;
                    spells[1] = 2;
                    break;
                case 1:
                    spells[0] = 3;
                    spells[1] = 3;
                    break;
                case 2:
                    spells[0] = 3;
                    spells[1] = 4;
                    spells[2] = 2;
                    break;
                case 3:
                    spells[0] = 4;
                    spells[1] = 4;
                    spells[2] = 3;
                    break;
                case 4:
                    spells[0] = 4;
                    spells[1] = 4;
                    spells[2] = 3;
                    spells[2] = 2;
                    break;
            } // end switch
            bigSpells[i] = spells;
        }


        for(int i=0;i<levelCap;i++) {
            // set all spell slots to -1 for no spells of cleric
            bigSpellsW[i] = spellsW;
            sneak[i] = "";
        }



        // set features per level
        feature[0] = "Spellcasting, Divine Domain";
        feature[1] = "Channel Divinity (1/rest), Divine Domain Feature";
        feature[2] = "-";
        feature[3] = "Ability Score Improvement";
        feature[4] = "Destroy Undead (CR 1/2)";

        aProf[0]="Light Armor";
        aProf[1]="Medium Armor";
        aProf[1]="Shields";

        wProf[0]="Simple Weapons";

        sProf[0]="Wisdom";
        sProf[1]="Charisma";

        setWeaponProficiencies(profs);
        setWizardSpells(bigSpellsW);
        setClericSpells(bigSpells);
        setFeatures(feature);
        //setArmorProfList("Light armor, medium armor, shields");
        setArmorProfList(aProf);
        //setWeaponProfList("Simple weapons");
        setWeaponProfList(wProf);
        //setProfSaves( "Wisdom, Charisma");
        setProfSaves(sProf);
        setHitDice(8);
        setStartHP(8);
        setAbilityImprovement(abilityImp);
        setSneakAttack(sneak);

    } //end wizardClass

    public static void rogueClass() {
        // set all values to match barbarian being selected
        Integer[] profs = new Integer[levelCap];
        Integer[] rages = new Integer[levelCap];
        Integer[] rageDamage = new Integer[levelCap];
        Integer[] spells = {0, 0, 0, 0, 0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[] abilityImp = {false, false, false, true, false};
        String[] feature = new String[levelCap];
        String[] wProf = new String[profCap];
        String[] aProf = new String[profCap];
        String[] sProf = new String[profCap];
        String[] sneak = new String[levelCap];

        try {
            setClassChoice("Rogue");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0; i < levelCap; i++) {
            // set load weapon prof bonus, rage damage and rages
            if (i<4)
                profs[i] = 2;
            else
                profs[i] = 3;

            switch (i) {
                case 0:
                case 1:
                    sneak[i] = "1D6";
                    break;
                case 2:
                case 3:
                    sneak[i] = "2D6";
                    break;
                case 4:
                    sneak[i] = "3D6";
                    break;
            } // end sneak switch
        } // end for profs,sneak

        for (int i = 0; i < levelCap; i++) {
            // set all spell slots to -1 for no spells
            bigSpells[i] = spells;
        }

        feature[0] = "Expertise, Sneak Attack, Thieves Cant";
        feature[1] = "Cunning Action";
        feature[2] = "Roguish Archetype";
        feature[3] = "Ability Score Improvement";
        feature[4] = "Uncanny Dodge";

        wProf[0] = "Simple Weapons";
        wProf[1] = "Hand Crossbows";
        wProf[2] = "Longswords";
        wProf[3] = "Rapiers";
        wProf[4] = "Short Swords";

        aProf[0] = "Light Armor";

        sProf[0]="Dexterity";
        sProf[1]="Intelligence";

        setFeatures(feature);
        //setWeaponProfList("Simple weapons, martial weapons");
        setWeaponProfList(wProf);
        //setArmorProfList("Light armor, medium armor, shields");
        setArmorProfList(aProf);
        //setProfSaves( "Strength, Constitution");
        setProfSaves(sProf);
        setAbilityImprovement(abilityImp);
        setWizardSpells(bigSpells);
        setDruidSpells(bigSpells);
        setClericSpells(bigSpells);
        setRageDamage(rageDamage);
        setRages(rages);
        setWeaponProficiencies(profs);
        setHitDice(8);
        setStartHP(8);
        setSneakAttack(sneak);
    } // end rogue class

    public static void barbarianClass() {
        // set all values to match barbarian being selected
        Integer[] profs = new Integer[levelCap];
        Integer[] rages = new Integer[levelCap];
        Integer[] rageDamage = new Integer[levelCap];
        Integer[]   spells = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]   feature = new String[levelCap];
        String[]    wProf = new String[profCap];
        String[]    aProf = new String[profCap];
        String[]    sProf = new String[profCap];
        String[]    sneak = new String[levelCap];

        try {
            setClassChoice("Barbarian");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            // set load weapon prof bonus, rage damage and rages
            sneak[i]="";
            profs[i]=2;
            rageDamage[i]=2;
            if(i<=1)
                rages[i]=2;
            else
                rages[i]=3;
        }

        for(int i=0;i<levelCap;i++) {
            // set all spell slots to -1 for no spells
            bigSpells[i] = spells;
        }

        feature[0]="Rage, Unarmored Defense";
        feature[1]="Reckless Attack, Danger Sense";
        feature[2]="Primal Path";
        feature[3]="Ability Score Improvement";
        feature[4]="Extra Attack,Fast Movement";

        wProf[0]="Simple Weapons";
        wProf[1]="Martial Weapons";

        aProf[0]="Light Armor";
        aProf[1]="Medium Armor";
        aProf[2]="Shields";

        sProf[0] = "Strength";
        sProf[1] = "Constitution";

        setFeatures(feature);
        //setWeaponProfList("Simple weapons, martial weapons");
        setWeaponProfList(wProf);
        //setArmorProfList("Light armor, medium armor, shields");
        setArmorProfList(aProf);
        //setProfSaves( "Strength, Constitution");
        setProfSaves(sProf);
        setAbilityImprovement(abilityImp);
        setWizardSpells(bigSpells);
        setDruidSpells(bigSpells);
        setClericSpells(bigSpells);
        setRageDamage(rageDamage);
        setRages(rages);
        setWeaponProficiencies(profs);
        setHitDice(12);
        setStartHP(12);
        setSneakAttack(sneak);
        //System.out.println(weaponProficiencies[4]);
        //System.out.println(wizardSpells[4][2]);
        //System.out.println(features[2]);
    }  // end barbarian class

    public static void fighterClass() {
        // set all values to match barbarian being selected
        Integer[] profs = new Integer[levelCap];
        Integer[] rages = new Integer[levelCap];
        Integer[] rageDamage = new Integer[levelCap];
        Integer[]   spells = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]   feature = new String[levelCap];
        String[]    wProf = new String[profCap];
        String[]    aProf = new String[profCap];
        String[]    sProf = new String[profCap];
        String[]    sneak = new String[levelCap];

        try {
            setClassChoice("Fighter");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            // set load weapon prof bonus, rage damage and rages
            sneak[i] = "";
            rages[i] = 0;
            rageDamage[i] = 0;
            if(i<4)
                profs[i] = 2;
            else
                profs[i] = 3;
        }

        for(int i=0;i<levelCap;i++) {
            // set all spell slots to -1 for no spells
            bigSpells[i] = spells;
        }

        feature[0]="Fighting Style, Second Wind";
        feature[1]="Action Surge";
        feature[2]="Martial Archetype";
        feature[3]="Ability Score Improvement";
        feature[4]="Extra Attack";

        wProf[0]="Simple Weapons";
        wProf[1]="Martial Weapons";

        aProf[0]="All Armor";
        aProf[1]="Shields";

        sProf[0]="Strength";
        sProf[1]="Constitution";

        setFeatures(feature);
        //setWeaponProfList("Simple weapons, martial weapons");
        setWeaponProfList(wProf);
        //setArmorProfList("Light armor, medium armor, shields");
        setArmorProfList(aProf);
        //setProfSaves( "Strength, Constitution");
        setProfSaves(sProf);
        setAbilityImprovement(abilityImp);
        setWizardSpells(bigSpells);
        setDruidSpells(bigSpells);
        setClericSpells(bigSpells);
        setRageDamage(rageDamage);
        setRages(rages);
        setWeaponProficiencies(profs);
        setHitDice(10);
        setStartHP(10);
        setSneakAttack(sneak);
        //System.out.println(weaponProficiencies[4]);
        //System.out.println(wizardSpells[4][2]);
        //System.out.println(features[2]);
    } // end fighter class


    ////////////////////////////////
    // setters for initialization //
    ////////////////////////////////
    // for setters used to initialize later data
    // in general, only used in constructor

    public CharacterClass(){
        // CONSTRUCTOR
        clear();
        initCreateDescriptions();
    }

    private void initAddClassDesc(String name, String desc) {
        // allows for an addition of a character class and description to the description Hashmap
        descriptions.put(name,desc);
    }

    private void initCreateDescriptions() {
        // populate all the character type descriptions
        // BARARIAN
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
        // WIZARD
        initAddClassDesc("Wizard","Clad in the silver robes that denote her station, an elf closes her eyes" +
                " to shut out the distractions of the battlefield and begins her quiet chant. Fingers weaving in front" +
                " of her, she completes her spell and launches a tiny bead of fire toward the enemy ranks, where it" +
                " erupts into a conflagration that engulfs the soldiers.\n" +
                "\n" +
                "Checking and rechecking his work, a human scribes an intricate magic circle in chalk on the bare stone" +
                " floor, then sprinkles powdered iron along every line and graceful curve. When the circle is complete," +
                " he drones a long incantation. A hole opens in space inside the circle, bringing a whiff of brimstone" +
                " from the otherworldly plane beyond.\n" +
                "\n" +
                "Crouching on the floor in a dungeon intersection, a gnome tosses a handful of small bones inscribed " +
                "with mystic symbols, muttering a few words of power over them. Closing his eyes to see the visions " +
                "more clearly, he nods slowly, then opens his eyes and points down the passage to his left.\n" +
                "\n" +
                "Wizards are supreme magic-users, defined and united as a class by the spells they cast. Drawing on the" +
                " subtle weave of magic that permeates the cosmos, wizards cast spells of explosive fire, arcing" +
                " lightning, subtle deception, and brute-force mind control. Their magic conjures monsters from other " +
                "planes of existence, glimpses the future, or turns slain foes into zombies. Their mightiest spells " +
                "change one substance into another, call meteors down from the sky, or open portals to other worlds.\n" +
                "\n" +
                "Scholars of the Arcane\n" +
                "Wild and enigmatic, varied in form and function, the power of magic draws students who seek to master" +
                " its mysteries. Some aspire to become like the gods, shaping reality itself. Though the casting of a" +
                " typical spell requires merely the utterance of a few strange words, fleeting gestures, and sometimes " +
                "a pinch or clump of exotic materials, these surface components barely hint at the expertise attained " +
                "after years of apprenticeship and countless hours of study.\n" +
                "\n" +
                "Wizards live and die by their spells. Everything else is secondary. They learn new spells as they " +
                "experiment and grow in experience. They can also learn them from other wizards, from ancient tomes " +
                "or inscriptions, and from ancient creatures (such as the fey) that are steeped in magic.\n" +
                "\n" +
                "The Lure of Knowledge\n" +
                "Wizards’ lives are seldom mundane. The closest a wizard is likely to come to an ordinary life is " +
                "working as a sage or lecturer in a library or university, teaching others the secrets of the " +
                "multiverse. Other wizards sell their services as diviners, serve in military forces, or pursue lives" +
                " of crime or domination.\n" +
                "\n" +
                "But the lure of knowledge and power calls even the most unadventurous wizards out of the safety of" +
                " their libraries and laboratories and into crumbling ruins and lost cities. Most wizards believe that" +
                " their counterparts in ancient civilizations knew secrets of magic that have been lost to the ages," +
                " and discovering those secrets could unlock the path to a power greater than any magic available in " +
                "the present age.\n" +
                "\n" +
                "Creating a Wizard\n" +
                "Creating a wizard character demands a backstory dominated by at least one extraordinary event. How" +
                " did your character first come into contact with magic? How did you discover you had an aptitude " +
                "for it? Do you have a natural talent, or did you simply study hard and practice incessantly? Did you" +
                " encounter a magical creature or an ancient tome that taught you the basics of magic?\n" +
                "\n" +
                "What drew you forth from your life of study? Did your first taste of magical knowledge leave you " +
                "hungry for more? Have you received word of a secret repository of knowledge not yet plundered by any" +
                " other wizard? Perhaps you’re simply eager to put your newfound magical skills to the test in the " +
                "face of danger.");
        //CLERIC
        initAddClassDesc("Cleric","Arms and eyes upraised toward the sun and a prayer on his lips, an elf " +
                "begins to glow with an inner light that spills out to heal his battle-worn companions.\n" +
                "\n" +
                "Chanting a song of glory, a dwarf swings his axe in wide swaths to cut through the ranks of orcs " +
                "arrayed against him, shouting praise to the gods with every foe’s fall.\n" +
                "\n" +
                "Calling down a curse upon the forces of undeath, a human lifts her holy symbol as light pours from it" +
                " to drive back the zombies crowding in on her companions.\n" +
                "\n" +
                "Clerics are intermediaries between the mortal world and the distant planes of the gods. As varied as" +
                " the gods they serve, clerics strive to embody the handiwork of their deities. No ordinary priest," +
                " a cleric is imbued with divine magic.\n" +
                "\n" +
                "Healers and Warriors\n" +
                "Divine magic, as the name suggests, is the power of the gods, flowing from them into the world. " +
                "Clerics are conduits for that power, manifesting it as miraculous effects. The gods don’t grant this" +
                " power to everyone who seeks it, but only to those chosen to fulfill a high calling.\n" +
                "\n" +
                "Harnessing divine magic doesn’t rely on study or training. A cleric might learn formulaic prayers and" +
                " ancient rites, but the ability to cast cleric spells relies on devotion and an intuitive sense of a " +
                "deity’s wishes.\n" +
                "\n" +
                "Clerics combine the helpful magic of healing and inspiring their allies with spells that harm and " +
                "hinder foes. They can provoke awe and dread, lay curses of plague or poison, and even call down flames" +
                " from heaven to consume their enemies. For those evildoers who will benefit most from a mace to the " +
                "head, clerics depend on their combat training to let them wade into melee with the power of the gods" +
                " on their side.\n" +
                "\n" +
                "Divine Agents\n" +
                "Not every acolyte or officiant at a temple or shrine is a cleric. Some priests are called to a simple " +
                "life of temple service, carrying out their gods’ will through prayer and sacrifice, not by magic" +
                " and strength of arms. In some cities, priesthood amounts to a political office, viewed as a stepping" +
                " stone to higher positions of authority and involving no communion with a god at all. True clerics" +
                " are rare in most hierarchies.\n" +
                "\n" +
                "When a cleric takes up an adventuring life, it is usually because his or her god demands it. Pursuing " +
                "the goals of the gods often involves braving dangers beyond the walls of civilization, smiting evil or" +
                " seeking holy relics in ancient tombs. Many clerics are also expected to protect their deities’" +
                " worshipers, which can mean fighting rampaging orcs, negotiating peace between warring nations, or " +
                "sealing a portal that would allow a demon prince to enter the world.\n" +
                "\n" +
                "Most adventuring clerics maintain some connection to established temples and orders of their faiths. " +
                "A temple might ask for a cleric’s aid, or a high priest might be in a position to demand it.\n" +
                "\n" +
                "Creating a Cleric\n" +
                "As you create a cleric, the most important question to consider is which deity to serve and what " +
                "principles you want your character to embody. The Gods of the Multiverse section includes lists of " +
                "many of the gods of the multiverse. Check with your DM to learn which deities are in your campaign.\n" +
                "\n" +
                "Once you’ve chosen a deity, consider your cleric’s relationship to that god. Did you enter this" +
                " service willingly? Or did the god choose you, impelling you into service with no regard for your" +
                " wishes? How do the temple priests of your faith regard you: as a champion or a troublemaker? What" +
                " are your ultimate goals? Does your deity have a special task in mind for you? Or are you striving" +
                " to prove yourself worthy of a great quest?");

        initAddClassDesc("Rogue","Signaling for her companions to wait, a halfling creeps forward throug" +
                "h the dungeon hall. She presses an ear to the door, then pulls out a set of tools and picks the lock" +
                " in the blink of an eye. Then she disappears into the shadows as her fighter friend moves forward" +
                " to kick the door open.\n" +
                "\n" +
                "A human lurks in the shadows of an alley while his accomplice prepares for her part in the ambush." +
                " When their target — a notorious slaver — passes the alleyway, the accomplice cries out, the slaver" +
                " comes to investigate, and the assassin’s blade cuts his throat before he can make a sound.\n" +
                "\n" +
                "Suppressing a giggle, a gnome waggles her fingers and magically lifts the key ring from the guard’s " +
                "belt. In a moment, the keys are in her hand, the cell door is open, and she and her companions are" +
                " free to make their escape.\n" +
                "\n" +
                "Rogues rely on skill, stealth, and their foes’ vulnerabilities to get the upper hand in any situation." +
                " They have a knack for finding the solution to just about any problem, demonstrating a resourcefulness" +
                " and versatility that is the cornerstone of any successful adventuring party.\n" +
                "\n" +
                "Skill and Precision\n" +
                "Rogues devote as much effort to mastering the use of a variety of skills as they do to perfecting " +
                "their combat abilities, giving them a broad expertise that few other characters can match. Many rogues" +
                " focus on stealth and deception, while others refine the skills that help them in a dungeon" +
                " environment, such as climbing, finding and disarming traps, and opening locks.\n" +
                "\n" +
                "When it comes to combat, rogues prioritize cunning over brute strength. A rogue would rather make one" +
                " precise strike, placing it exactly where the attack will hurt the target most, than wear an opponent" +
                " down with a barrage of attacks. Rogues have an almost supernatural knack for avoiding danger, and a" +
                " few learn magical tricks to supplement their other abilities.\n" +
                "\n" +
                "A Shady Living\n" +
                "Every town and city has its share of rogues. Most of them live up to the worst stereotypes of the " +
                "class, making a living as burglars, assassins, cutpurses, and con artists. Often, these scoundrels are" +
                " organized into thieves’ guilds or crime families. Plenty of rogues operate independently, but even" +
                " they sometimes recruit apprentices to help them in their scams and heists. A few rogues make an" +
                " honest living as locksmiths, investigators, or exterminators, which can be a dangerous job in a world" +
                " where dire rats—and wererats—haunt the sewers.\n" +
                "\n" +
                "As adventurers, rogues fall on both sides of the law. Some are hardened criminals who decide to seek " +
                "their fortune in treasure hoards, while others take up a life of adventure to escape from the law." +
                " Some have learned and perfected their skills with the explicit purpose of infiltrating ancient ruins " +
                "and hidden crypts in search of treasure.\n" +
                "\n" +
                "Creating a Rogue\n" +
                "As you create your rogue character, consider the character’s relationship to the law. Do you have a" +
                " criminal past—or present? Are you on the run from the law or from an angry thieves’ guild master?" +
                " Or did you leave your guild in search of bigger risks and bigger rewards? Is it greed that drives " +
                "you in your adventures, or some other desire or ideal?\n" +
                "\n" +
                "What was the trigger that led you away from your previous life? Did a great con or heist gone " +
                "terribly wrong cause you to reevaluate your career? Maybe you were lucky and a successful robbery " +
                "gave you the coin you needed to escape the squalor of your life. Did wanderlust finally call you" +
                " away from your home? Perhaps you suddenly found yourself cut off from your family or your mentor," +
                " and you had to find a new means of support. Or maybe you made a new friend—another member of your" +
                " adventuring party—who showed you new possibilities for earning a living and employing your " +
                "particular talents.");

        initAddClassDesc("Fighter", "A human in clanging plate armor holds her shield before her as she" +
                " runs toward the massed goblins. An elf behind her, clad in studded leather armor, peppers the goblins" +
                " with arrows loosed from his exquisite bow. The half-orc nearby shouts orders, helping the two " +
                "combatants coordinate their assault to the best advantage.\n" +
                "\n" +
                "A dwarf in chain mail interposes his shield between the ogre’s club and his companion, knocking the " +
                "deadly blow aside. His companion, a half-elf in scale armor, swings two scimitars in a blinding whirl" +
                " as she circles the ogre, looking for a blind spot in its defenses.\n" +
                "\n" +
                "A gladiator fights for sport in an arena, a master with his trident and net, skilled at toppling foes" +
                " and moving them around for the crowd’s delight—and his own tactical advantage. His opponent’s sword " +
                "flares with blue light an instant before she sends lightning flashing forth to smite him.\n" +
                "\n" +
                "All of these heroes are fighters, perhaps the most diverse class of characters in the worlds of " +
                "Dungeons & Dragons. Questing knights, conquering overlords, royal champions, elite foot soldiers," +
                " hardened mercenaries, and bandit kings—as fighters, they all share an unparalleled mastery with " +
                "weapons and armor, and a thorough knowledge of the skills of combat. And they are well acquainted" +
                " with death, both meting it out and staring it defiantly in the face.\n" +
                "\n" +
                "Well-Rounded Specialists\n" +
                "Fighters learn the basics of all combat styles. Every fighter can swing an axe, fence with a rapier," +
                " wield a longsword or a greatsword, use a bow, and even trap foes in a net with some degree of skill." +
                " Likewise, a fighter is adept with shields and every form of armor. Beyond that basic degree of" +
                " familiarity, each fighter specializes in a certain style of combat. Some concentrate on archery," +
                " some on fighting with two weapons at once, and some on augmenting their martial skills with magic." +
                " This combination of broad general ability and extensive specialization makes fighters superior" +
                " combatants on battlefields and in dungeons alike.\n" +
                "\n" +
                "Trained for Danger\n" +
                "Not every member of the city watch, the village militia, or the queen’s army is a fighter. Most of" +
                " these troops are relatively untrained soldiers with only the most basic combat knowledge. Veteran" +
                " soldiers, military officers, trained bodyguards, dedicated knights, and similar figures are " +
                "fighters.\n" +
                "\n" +
                "Some fighters feel drawn to use their training as adventurers. The dungeon delving, monster slaying, " +
                "and other dangerous work common among adventurers is second nature for a fighter, not all that" +
                " different from the life he or she left behind. There are greater risks, perhaps, but also much" +
                " greater rewards—few fighters in the city watch have the opportunity to discover a magic flame tongue" +
                " sword, for example.\n" +
                "\n" +
                "Creating a Fighter\n" +
                "As you build your fighter, think about two related elements of your character’s background: Where " +
                "did you get your combat training, and what set you apart from the mundane warriors around you? Were " +
                "you particularly ruthless? Did you get extra help from a mentor, perhaps because of your exceptional" +
                " dedication? What drove you to this training in the first place? A threat to your homeland, a thirst" +
                " for revenge, or a need to prove yourself might all have been factors.\n" +
                "\n" +
                "You might have enjoyed formal training in a noble’s army or in a local militia. Perhaps you trained " +
                "in a war academy, learning strategy, tactics, and military history. Or you might be " +
                "self-taught—unpolished but well tested. Did you take up the sword as a way to escape the limits of" +
                " life on a farm, or are you following a proud family tradition? Where did you acquire your weapons " +
                "and armor? They might have been military issue or family heirlooms, or perhaps you scrimped and saved " +
                "for years to buy them. Your armaments are now among your most important possessions—the only things" +
                " that stand between you and death’s embrace.");
    } // end initCreateDescriptions

}
