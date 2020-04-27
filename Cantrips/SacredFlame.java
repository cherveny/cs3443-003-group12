public class SacredFlame extends Spell {
  
  private int Level = 0;
  
  private String name = "Sacred Flame";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Sacred Flame\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S\n"+
                       "Duration: instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Radiant\n"+
                       "Description: Flame-like radiance descends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving throw.\nThe spell's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
  public SacredFlame() {
    
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
