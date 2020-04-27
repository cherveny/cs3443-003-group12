
public class Cantrip {
	static Spell spell;
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
		else if ( name.contains("Spare the Dying")) {
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
