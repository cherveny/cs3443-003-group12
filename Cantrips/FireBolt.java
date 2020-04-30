package Cantrips;

import MainPackage.Spell;

public class FireBolt extends Spell {
  
  private int Level = 0;
  
  private String name = "Fire Bolt";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Fire Bolt\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: Ranged\n"+
                       "Damage/Effect: Fire\n"+
                       "Description: You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. A flammable object hit by this spell ignites if it isn't being worn or carried.\nThis spell's damage increases by 1d10 when you reach 5th level (2d10), 11th level (3d10), and 17th level (4d10).";
  public FireBolt() {
    
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
