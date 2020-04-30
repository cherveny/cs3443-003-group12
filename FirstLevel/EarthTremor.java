package FirstLevel;

import MainPackage.Spell;

public class EarthTremor extends Spell {
  
  private int Level = 1;
  
  private String name = "Earth Tremor";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Earth Tremor\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 10 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocaion\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Bludgeoning\n"+
                       "Description: You cause a tremor in the ground within range. Each creature other than you in that area must make a Dexterity saving throw. On a failed save, a creature takes 1d6 bludgeoning damage and is knocked prone. If the ground in that area is loose earth or stone, it becomes difficult terrain until cleared, with each 5-foot-diameter portion requiring at least 1 minute to clear by hand.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
  

  
  public EarthTremor() {
    
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
