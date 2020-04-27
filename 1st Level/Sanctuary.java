public class Sanctuary extends Spell {
  
  private int Level = 1;
  
  private String name = "Sanctuary";
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Sanctuary\n"+
                       "Casting Time: 1 Bonus Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: WIS Save\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: You ward a creature within range against attack. Until the spell ends, any creature who targets the warded creature with an attack or a harmful spell must first make a Wisdom saving throw. On a failed save, the creature must choose a new target or lose the attack or spell. This spell doesn't protect the warded creature from area effects, such as the explosion of a fireball.\nIf the warded creature makes an attack, casts a spell that affects an enemy, or deals damage to another creature, this spell ends.";
  

  
  public Sanctuary() {
    
  }
  
  //GETTERS//
  public int getLevel()
  {
    return this.Level;
  }
  
  public String[] getClassRequirement()
  {
    return this.ClassRequirement;
  }
    
  public String getName()
  {
    return name;
  }
  
  public String getDescription()
  {
    return this.Description;
  }
}
