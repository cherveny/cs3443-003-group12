package Cantrips;

import MainPackage.Spell;

public class CreateBonfire extends Spell {
  
  private int Level = 0;
  
  private String name = "Create Bonfire";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Create Bonfire\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 min\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Fire\n"+
                       "Description: You create a bonfire on ground that you can see within range. Until the spell ends, the magic bonfire fills a 5-foot cube. Any creature in the bonfire’s space when you cast the spell must succeed on a Dexterity saving throw or take 1d8 fire damage. A creature must also make the saving throw when it moves into the bonfire’s space for the first time on a turn or ends its turn there.\nThe bonfire ignites flammable objects in its area that aren’t being worn or carried.\nThe spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
  public CreateBonfire() {
    
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
