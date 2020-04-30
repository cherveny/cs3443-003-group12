package FirstLevel;

import MainPackage.Spell;

public class ControlFlames extends Spell {
  
  private int Level = 0;
  
  private String name = "Control Flames";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Control Flames\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You choose nonmagical flame that you can see within range and that fits within a 5-foot cube. You affect it in one of the following ways:\nYou instantaneously expand the flame 5 feet in one direction, provided that wood or other fuel is present in the new location.\nYou instantaneously extinguish the flames within the cube.\nYou double or halve the area of bright light and dim light cast by the flame, change its color, or both. The change lasts for 1 hour.\nYou cause simple shapes—such as the vague form of a creature, an inanimate object, or a location—to appear within the flames and animate as you like. The shapes last for 1 hour.\n\nIf you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
  public ControlFlames() {
    
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
