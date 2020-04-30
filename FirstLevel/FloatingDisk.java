package FirstLevel;

import MainPackage.Spell;

public class FloatingDisk extends Spell {
  
  private int Level = 1;
  
  private String name = "Floating Disk";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Floating Disk\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Hour\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Movement\n"+
                       "Description: This spell creates a circular, horizontal plane of force, 3 feet in diameter and 1 inch thick, that floats 3 feet above the ground in an unoccupied space of your choice that you can see within range. The disk remains for the duration, and can hold up to 500 pounds. If more weight is placed on it, the spell ends, and everything on the disk falls to the ground.\nThe disk is immobile while you are within 20 feet of it. If you move more than 20 feet away from it, the disk follows you so that it remains within 20 feet of you. It can move across uneven terrain, up or down stairs, slopes and the like, but it can't cross an elevation change of 10 feet or more. For example, the disk can't move across a 10-foot-deep pit, nor could it leave such a pit if it was created at the bottom.\nIf you move more than 100 feet from the disk (typically because it can't move around an obstacle to follow you), the spell ends.";
  

  
  public FloatingDisk() {
    
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
