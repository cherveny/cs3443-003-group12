package MainPackage;


import java.util.ArrayList;

import FirstLevel.AbsorbElements;
import FirstLevel.AcidStream;
import FirstLevel.Alarm;
import FirstLevel.Bane;
import FirstLevel.Bless;
import FirstLevel.BurningHands;
import FirstLevel.Catapult;
import FirstLevel.CharmPerson;
import FirstLevel.ColorSpray;
import FirstLevel.Command;
import FirstLevel.ComprehendLanguage;
import FirstLevel.CreateOrDestroyWater;
import FirstLevel.CureWounds;
import FirstLevel.DetectEvilAndGood;
import FirstLevel.DetectMagic;
import FirstLevel.DetectPoisonAndDisease;
import FirstLevel.DisguiseSelf;
import FirstLevel.EarthTremor;
import FirstLevel.ExpeditiousRetreat;
import FirstLevel.FalseLife;
import FirstLevel.FeatherFall;
import FirstLevel.FloatingDisk;
import FirstLevel.FogCloud;
import FirstLevel.Grease;
import FirstLevel.GuidingBolt;
import FirstLevel.HealingWord;
import FirstLevel.HideousLaughter;
import FirstLevel.IceKnife;
import FirstLevel.Identify;
import FirstLevel.IllusoryScript;
import FirstLevel.InflictWounds;
import FirstLevel.Jump;
import FirstLevel.Longstrider;
import FirstLevel.MageArmor;
import FirstLevel.MagicMissile;
import FirstLevel.ProtectionFromEvilAndGood;
import FirstLevel.PurifyFoodAndDrink;
import FirstLevel.Sanctuary;
import FirstLevel.Shield;
import FirstLevel.ShieldOfFaith;
import FirstLevel.SilentImage;
import FirstLevel.Sleep;
import FirstLevel.Thunderwave;
import FirstLevel.UnseenServant;

public class SpellFirst {
	static Spell spell;
	public static ArrayList<Spell> spellList = new ArrayList<Spell>();
	
	
	
	///  fill an arraylist with all level 1 spells
	public static void fillList()
	{
		Spell temp = new AbsorbElements();
		spellList.add(temp);
		temp = new AcidStream();
		spellList.add(temp);
		temp = new Alarm();
		spellList.add(temp);
		temp = new Bane();
		spellList.add(temp);
		temp = new Bless();
		spellList.add(temp);
		temp = new BurningHands();
		spellList.add(temp);
		temp = new Catapult();
		spellList.add(temp);
		temp = new CharmPerson();
		spellList.add(temp);
		temp = new ColorSpray();
		spellList.add(temp);
		temp = new Command();
		spellList.add(temp);
		temp = new ComprehendLanguage();
		spellList.add(temp);
		temp = new CreateOrDestroyWater();
		spellList.add(temp);
		temp = new CureWounds();
		spellList.add(temp);
		temp = new DetectEvilAndGood();
		spellList.add(temp);
		temp = new DetectMagic();
		spellList.add(temp);
		temp = new DetectPoisonAndDisease();
		spellList.add(temp);
		temp = new DisguiseSelf();
		spellList.add(temp);
		temp = new EarthTremor();
		spellList.add(temp);
		temp = new ExpeditiousRetreat();
		spellList.add(temp);
		temp = new FalseLife();
		spellList.add(temp);
		temp = new FeatherFall();
		spellList.add(temp);
		temp = new FloatingDisk();
		spellList.add(temp);
		temp = new FogCloud();
		spellList.add(temp);
		temp = new Grease();
		spellList.add(temp);
		temp = new GuidingBolt();
		spellList.add(temp);
		temp = new HealingWord();
		spellList.add(temp);
		temp = new HideousLaughter();
		spellList.add(temp);
		temp = new IceKnife();
		spellList.add(temp);
		temp = new Identify();
		spellList.add(temp);
		temp = new IllusoryScript();
		spellList.add(temp);
		temp = new InflictWounds();
		spellList.add(temp);
		temp = new Jump();
		spellList.add(temp);
		temp = new Longstrider();
		spellList.add(temp);
		temp = new MageArmor();
		spellList.add(temp);
		temp = new MagicMissile();
		spellList.add(temp);
		temp = new ProtectionFromEvilAndGood();
		spellList.add(temp);
		temp = new PurifyFoodAndDrink();
		spellList.add(temp);
		temp = new Sanctuary();
		spellList.add(temp);
		temp = new Shield();
		spellList.add(temp);
		temp = new ShieldOfFaith();
		spellList.add(temp);
		temp = new SilentImage();
		spellList.add(temp);
		temp = new Sleep();
		spellList.add(temp);
		temp = new Thunderwave();
		spellList.add(temp);
		temp = new UnseenServant();
		spellList.add(temp);
	}
	
	/// to be used to search for a level 1 spell
	public static Spell getSpell(String name) {
	
		
		if ( name.contains("Absorb Elements")) {
			spell = new AbsorbElements();
		}
		else if ( name.contains("Acid Stream")) {
			spell = new AcidStream();
		}
		else if ( name.contains("Alarm")) {
			spell = new Alarm();
		}
		else if ( name.contains("Bane")) {
			spell = new Bane();
		}
		else if ( name.contains("Bless")) {
			spell = new Bless();
		}
		else if ( name.contains("Burning Hands")) {
			spell = new BurningHands();
		}
		else if ( name.contains("Catapult")) {
			spell = new Catapult();
		}
		else if ( name.contains("Charm Person")) {
			spell = new CharmPerson();
		}
		else if ( name.contains("Color Spray")) {
			spell = new ColorSpray();
		}
		else if ( name.contains("Command")) {
			spell = new Command();
		}
		else if ( name.contains("Comprehend Language")) {
			spell = new ComprehendLanguage();
		}
		else if ( name.contains("Create or Destroy Water")) {
			spell = new CreateOrDestroyWater();
		}
		else if ( name.contains("Cure Wounds")) {
			spell = new CureWounds();
		}
		else if ( name.contains("Detect Evil and Good")) {
			spell = new DetectEvilAndGood();
		}
		else if ( name.contains("Detect Magic")) {
			spell = new DetectMagic();
		}
		else if ( name.contains("Detect Poison and Disease")) {
			spell = new DetectPoisonAndDisease();
		}
		else if ( name.contains("Disguise Self")) {
			spell = new DisguiseSelf();
		}
		else if ( name.contains("Earth Tremor")) {
			spell = new EarthTremor();
		}
		else if ( name.contains("Expeditious Retreat")) {
			spell = new ExpeditiousRetreat();
		}
		else if ( name.contains("False Life")) {
			spell = new FalseLife();
		}
		else if ( name.contains("Feather Fall")) {
			spell = new FeatherFall();
		}
		else if ( name.contains("Floating Disk")) {
			spell = new FloatingDisk();
		}
		else if ( name.contains("Fog Cloud")) {
			spell = new FogCloud();
		}
		else if ( name.contains("Grease")) {
			spell = new Grease();
		}
		else if ( name.contains("Guiding Bolt")) {
			spell = new GuidingBolt();
		}
		else if ( name.contains("Healing Word")) {
			spell = new HealingWord();
		}
		else if ( name.contains("Hideous Laughter")) {
			spell = new HideousLaughter();
		}
		else if ( name.contains("Ice Knife")) {
			spell = new IceKnife();
		}
		else if ( name.contains("Identify")) {
			spell = new Identify();
		}
		else if ( name.contains("Illusory Script")) {
			spell = new IllusoryScript();
		}
		else if ( name.contains("Inflict Wounds")) {
			spell = new InflictWounds();
		}
		else if ( name.contains("Jump")) {
			spell = new Jump();
		}
		else if ( name.contains("Longstrider")) {
			spell = new Longstrider();
		}
		else if ( name.contains("Mage Armor")) {
			spell = new MageArmor();
		}
		else if ( name.contains("Magic Missile")) {
			spell = new MagicMissile();
		}
		else if ( name.contains("Protection from Evil and Good")) {
			spell = new ProtectionFromEvilAndGood();
		}
		else if ( name.contains("Purify Food and Drink")) {
			spell = new PurifyFoodAndDrink();
		}
		else if ( name.contains("Sanctuary")) {
			spell = new Sanctuary();
		}
		else if ( name.contains("Shield")) {
			spell = new Shield();
		}
		else if ( name.contains("Shield of Faith")) {
			spell = new ShieldOfFaith();
		}
		else if ( name.contains("Silent Image")) {
			spell = new SilentImage();
		}
		else if ( name.contains("Sleep")) {
			spell = new Sleep();
		}
		else if ( name.contains("Thunderwave")) {
			spell = new Thunderwave();
		}
		else if ( name.contains("Unseen Servant")) {
			spell = new UnseenServant();
		}
		else {
			spell = new NoSpell();
		}
		return spell;
	}
}
