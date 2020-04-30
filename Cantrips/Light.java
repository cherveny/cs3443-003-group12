package Cantrips;

import MainPackage.Spell;

public class Light extends Spell{
  private int Level = 0;
  private String name = "Light";
  private String ClassRequirement[] = {"Cleric", "Wizard"};
  private String Description = "Spell: Light\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,M *\n"+
                       "Duration: 1 hr\n"+
                       "School: Evocation\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Creation\n"+
                       "Description: You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.\nIf you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the spell.";
  
  public Light() {
    
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
