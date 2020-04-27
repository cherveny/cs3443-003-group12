
public class SpellManager {
	
	public static Spell findSpell(String name, int lvl) {
		Spell spell;
		if (lvl == 0) {
			spell = Cantrip.getSpell(name);
		}
		else if (lvl == 1) {
			spell = SpellFirst.getSpell(name);
		}
		else {
			spell = new NoSpell();
		}
		return spell;
	}
}
