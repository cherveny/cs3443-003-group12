
public class SpellFirst {
	static Spell spell;
	
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
