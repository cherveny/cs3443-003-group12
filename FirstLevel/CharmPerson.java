package FirstLevel;

import MainPackage.Spell;

public class CharmPerson extends Spell {
  
  private int Level = 1;
  
  private String name = "Charm Person";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Charm Person\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 Hour\n"+
                       "School: Enchantment\n"+
                       "Attack/Save: WIS Save\n"+
                       "Damage/Effect: Charmed\n"+
                       "Description: You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st. The creatures must be within 30 feet of each other when you target them.";
  

  
  public CharmPerson() {
    
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
