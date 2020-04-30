package FirstLevel;

import MainPackage.Spell;

public class HideousLaughter extends Spell {
  
  private int Level = 1;
  
  private String name = "Hideous Laughter";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Hideous Laughter\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Enchantment\n"+
                       "Attack/Save: WIS Save\n"+
                       "Damage/Effect: Prone\n"+
                       "Description: A creature of your choice that you can see within range perceives everything as hilariously funny and falls into fits of laughter if this spell affects it. The target must succeed on a Wisdom saving throw or fall prone, becoming incapacitated and unable to stand up for the duration. A creature with an Intelligence score of 4 or less isn't affected.\nAt the end of each of its turns, and each time it takes damage, the target can make another Wisdom saving throw. The target has advantage on the saving throw if it's triggered by damage. On a success, the spell ends.";
  

  
  public HideousLaughter() {
    
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
