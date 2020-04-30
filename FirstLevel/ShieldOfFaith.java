package FirstLevel;

import MainPackage.Spell;

public class ShieldOfFaith extends Spell {
  
  private int Level = 1;
  
  private String name = "Shield Of Faith";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Shield of Faith\n"+
                       "Casting Time: 1 Bonus Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 10 Min\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: A shimmering field appears and surrounds a creature of your choice within range, granting it a +2 bonus to AC for the duration.";
  

  
  public ShieldOfFaith() {
    
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
