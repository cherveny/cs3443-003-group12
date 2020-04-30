package MainPackage;

import java.util.ArrayList;

import Cantrips.AcidSplash;
import Cantrips.ChillTouch;
import Cantrips.CreateBonfire;
import Cantrips.DancingLights;
import Cantrips.FireBolt;
import Cantrips.Frostbite;
import Cantrips.Guidance;
import Cantrips.Gust;
import Cantrips.Light;
import Cantrips.MageHand;
import Cantrips.Mending;
import Cantrips.Message;
import Cantrips.MinorIllusion;
import Cantrips.MoldEarth;
import Cantrips.PoisonSpray;
import Cantrips.Prestidigitation;
import Cantrips.RayOfFrost;
import Cantrips.Resistance;
import Cantrips.SacredFlame;
import Cantrips.ShapeWater;
import Cantrips.ShockingGrasp;
import Cantrips.SpareTheDying;
import Cantrips.Thaumaturgy;
import Cantrips.Thunderclap;
import Cantrips.TrueStrike;
import FirstLevel.ControlFlames;

/*
 * 
 * 		This Class was made by Mazen to Manage Cantrip Spells
 * 
 * 
 * */
public class Cantrip {
	static Spell spell;
public static ArrayList<Spell> spellList = new ArrayList<Spell>(); //ArrayList to easily manage spells
	
	
	
	// Method to fill arrayList with cantrip spells
	public static void fillList()
	{
		Spell temp = new AcidSplash();
		spellList.add(temp);
		temp = new ChillTouch();
		spellList.add(temp);
		temp = new ControlFlames();
		spellList.add(temp);
		temp = new CreateBonfire();
		spellList.add(temp);
		temp = new DancingLights();
		spellList.add(temp);
		temp = new FireBolt();
		spellList.add(temp);
		temp = new Frostbite();
		spellList.add(temp);
		temp = new Guidance();
		spellList.add(temp);
		temp = new Gust();
		spellList.add(temp);
		temp = new Light();
		spellList.add(temp);
		temp = new MageHand();
		spellList.add(temp);
		temp = new Mending();
		spellList.add(temp);
		temp = new Message();
		spellList.add(temp);
		temp = new MinorIllusion();
		spellList.add(temp);
		temp = new MoldEarth();
		spellList.add(temp);
		temp = new PoisonSpray();
		spellList.add(temp);
		temp = new Prestidigitation();
		spellList.add(temp);
		temp = new RayOfFrost();
		spellList.add(temp);
		temp = new Resistance();
		spellList.add(temp);
		temp = new SacredFlame();
		spellList.add(temp);
		temp = new ShapeWater();
		spellList.add(temp);
		temp = new ShockingGrasp();
		spellList.add(temp);
		temp = new SpareTheDying();
		spellList.add(temp);
		temp = new Thaumaturgy();
		spellList.add(temp);
		temp = new Thunderclap();
		spellList.add(temp);
		temp = new TrueStrike();
		spellList.add(temp);
		
	}
	
	// Method to return spell from arrayList if it if a cantrip level spell
	public static Spell getSpell(String name) {
		if ( name.contains("Acid Splash")) {
			spell = new AcidSplash();
		}
		else if ( name.contains("Chill Touch")) {
			spell = new ChillTouch();
		}
		else if ( name.contains("Control Flames")) {
			spell = new ControlFlames();
		}
		else if ( name.contains("Create Bonfire")) {
			spell = new CreateBonfire();
		}
		else if ( name.contains("Dancing Lights")) {
			spell = new DancingLights();
		}
		else if ( name.contains("Fire Bolt")) {
			spell = new FireBolt();
		}
		else if ( name.contains("Frostbite")) {
			spell = new Frostbite();
		}
		else if ( name.contains("Guidance")) {
			spell = new Guidance();
		}
		else if ( name.contains("Gust")) {
			spell = new Gust();
		}
		else if ( name.contains("Light")) {
			spell = new Light();
		}
		else if ( name.contains("Mage Hand")) {
			spell = new MageHand();
		}
		else if ( name.contains("Mending")) {
			spell = new Mending();
		}
		else if ( name.contains("Message")) {
			spell = new Message();
		}
		else if ( name.contains("Minor Illusion")) {
			spell = new MinorIllusion();
		}
		else if ( name.contains("Mold Earth")) {
			spell = new MoldEarth();
		}
		else if ( name.contains("Poison Spray")) {
			spell = new PoisonSpray();
		}
		else if ( name.contains("Prestidigitation")) {
			spell = new Prestidigitation();
		}
		else if ( name.contains("Ray of Frost")) {
			spell = new RayOfFrost();
		}
		else if ( name.contains("Resistance")) {
			spell = new Resistance();
		}
		else if ( name.contains("Sacred Flame")) {
			spell = new SacredFlame();
		}
		else if ( name.contains("Shape Water")) {
			spell = new ShapeWater();
		}
		else if ( name.contains("Shocking Grasp")) {
			spell = new ShockingGrasp();
		}
		else if ( name.contains("Spare The Dying")) {
			spell = new SpareTheDying();
		}
		else if ( name.contains("Thaumaturgy")) {
			spell = new Thaumaturgy();
		}
		else if ( name.contains("Thunderclap")) {
			spell = new Thunderclap();
		}
		else if ( name.contains("True Strike")) {
			spell = new TrueStrike();
		}
		else {
			spell = new NoSpell();
		}
		return spell;
	}
}
