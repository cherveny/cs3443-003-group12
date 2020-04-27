import java.lang.*;
import java.util.HashMap;
import java.util.Set;

public class CharacterClass {
    ////////////////////
    // CONSTANTS      //
    ////////////////////
    private static final Integer levelCap = 5;

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

    public static void clear() {
        // used if a user selected a class, but changed their mind.  Resets all values to init
        classChoice = "";
        Integer[]   profs = {0,0,0,0,0};
        Integer[]   spells = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,false,false};
        String[]    feature = new String[levelCap];

        for(int i=0;i<levelCap;i++) {
            // set all spell slots to 0 for no spells
            bigSpells[i] = spells;
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
        setWeaponProfList("");
        setArmorProfList("");
        setProfSaves("");
        setAbilityImprovement(abilityImp);
        setRages(spells);
        setRageDamage(spells);
        setHitDice(0);
        setStartHP(0);
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
        }

        // set features per level
        feature[0] = "Spellcasting, Arcane Recovery";
        feature[1] = "Arcane Tradition";
        feature[2] = "-";
        feature[3] = "Ability Score Improvement";
        feature[4] = "-";


        setWeaponProficiencies(profs);
        setWizardSpells(bigSpells);
        //setDruidSpells(bigSpells);
        setClericSpells(bigSpellsC);
        setFeatures(feature);
        setArmorProfList("None");
        setWeaponProfList("Daggers, darts, slings, quarterstaffs, light crossbows");
        setProfSaves( "Intelligence, Wisdom");
        setHitDice(6);
        setStartHP(6);
        setAbilityImprovement(abilityImp);

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
        }

        // set features per level
        feature[0] = "Spellcasting, Divine Domain";
        feature[1] = "Channel Divinity (1/rest), Divine Domain Feature";
        feature[2] = "-";
        feature[3] = "Ability Score Improvement";
        feature[4] = "Destroy Undead (CR 1/2)";


        setWeaponProficiencies(profs);
        setWizardSpells(bigSpellsW);
        setClericSpells(bigSpells);
        setFeatures(feature);
        setArmorProfList("Light armor, medium armor, shields");
        setWeaponProfList("Simple weapons");
        setProfSaves( "Wisdom, Charisma");
        setHitDice(8);
        setStartHP(8);
        setAbilityImprovement(abilityImp);

    } //end wizardClass

    public static void barbarianClass() {
        // set all values to match barbarian being selected
        Integer[] profs = new Integer[levelCap];
        Integer[] rages = new Integer[levelCap];
        Integer[] rageDamage = new Integer[levelCap];
        Integer[]   spells = {0,0,0,0,0};
        Integer[][] bigSpells = new Integer[levelCap][levelCap];
        Boolean[]   abilityImp = {false,false,false,true,false};
        String[]   feature = new String[levelCap];

        try {
            setClassChoice("Barbarian");
        } catch (Exception e) {
            System.out.println("Invalid Character choice");
        }

        for (int i = 0;i<levelCap;i++) {
            // set load weapon prof bonus, rage damage and rages
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

    } // end initCreateDescriptions

}
